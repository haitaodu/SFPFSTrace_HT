package com.smartflow.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.smartflow.common.stationenum.StationEnumUtil;
import com.smartflow.dto.AddCLStationDeviceDTO;
import com.smartflow.service.CL_StationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据采集通用接口
 * @author haita
 */

@RestController
@RequestMapping("/api/CLStation")
public class ClStationController extends BaseController{

    private static Logger logger = Logger.getLogger(ClStationController.class);

    private final
    CL_StationService clStationService;

    private final  static String NG_CODE="0";

    private final static String NG_KEY="IS_OK";

    private static final int ERROR_CODE=0;
    private static final int SUCEESS_CODE=200;


    private static final  String SERIAL_ARG="SERIALNUMBER";
    @Autowired
    public ClStationController(CL_StationService clStationService
    ) {
        this.clStationService = clStationService;

    }


    /**
     * 添加工站设备生产信息
     * @return 返回前端是否添加成功信息
     */
    @CrossOrigin(origins="*",maxAge=3600)
    @PostMapping(value="/AddCLStationDevice")
    public Map<String, Object> addclstationdevice
    (@RequestBody AddCLStationDeviceDTO clStationDeviceDTO){
        Map<String, Object> json = new HashMap<>(16);

            String linkTableName = clStationDeviceDTO.getLinkTableName();
            String className = "com.smartflow.model."+linkTableName;
            if(StringUtils.isEmpty(linkTableName)){
                json = this.setJson(ERROR_CODE, "添加失败：要添加的表名不能为空", -1);
                return json;
            }
            if(clStationDeviceDTO.getObject() == null){
                json = this.setJson(ERROR_CODE, "添加失败：要添加对象不能为空", -1);
                return json;
            }
            try {
                JSONObject jsonObject = JSON.parseObject(JSON.toJSONString(clStationDeviceDTO.getObject()));
                Integer workOrderId = clStationService.getCurrentActivedWorkOrder();
                jsonObject.put("WorkOrderId",workOrderId);
                jsonObject.put("CREATE_DATE",new Date());
                String serialNumber = jsonObject.get
                        (SERIAL_ARG) == null ? null :
                        jsonObject.get(SERIAL_ARG).toString();
                clStationDeviceDTO.setObject(reWrite(serialNumber,jsonObject,linkTableName));
                logger.info(clStationDeviceDTO);
                clStationService.addCLStationDevice(className, parseToEntity(linkTableName, clStationDeviceDTO));
                json = this.setJson(SUCEESS_CODE, "添加成功！", 1);
            }
            catch (Exception e)
            {
                logger.info(e.getStackTrace());
            }
        return json;
    }

    /**
     * 利用反射根据表名生成实体
     * @param linkedName 表名
     * @param clStationDeviceDTO 请求参数
     * @return 返回请求实体
     * @throws ClassNotFoundException 根据表名未查到相应的类
     */
    @SuppressWarnings("unckecked")
    private  Object parseToEntity(String linkedName,AddCLStationDeviceDTO clStationDeviceDTO) throws ClassNotFoundException {
        Class<?> classEntity=Class.forName("com.smartflow.model."+linkedName);
        return  JSON.parseObject
                (JSON.toJSONString(clStationDeviceDTO.getObject()),
                        classEntity);

    }

    /**
     * 根据seialNumber和linkTableName判断是否覆盖op50以前的serialNumber
     * @param serialNumber 条形码
     * @param jsonObject 请求实体
     * @param linkTableName 请求表名
     * @return 返回修饰的请求实体
     */
    private JSONObject reWrite(String serialNumber,JSONObject jsonObject,String linkTableName) {

        /*
         * 判断条形码是否是空，若为空的话，自己生成条形码
         */
        if (serialNumber == null||"".equals(serialNumber))
        {
            Date date = new Date();
            serialNumber="NoSerial"+date.toString();
        }

        /*
         * 判断NG字段是否为报警状态且为TU,RE,IM的NG字段
         */
        if (NG_CODE.equals(jsonObject.get(NG_KEY)) &&StationEnumUtil.isNgWriteTable(linkTableName))
        {
            jsonObject.put("state",1);
            clStationService.writeNg(serialNumber,linkTableName);
            return jsonObject;
        }
        /*
         * 判断是否是需要覆盖的表，覆盖的表有state，且初始的时候置0
         * 包含工站组Tu,Re,Im
         * eg:TUOP20.25,30
         */
     if (StationEnumUtil.isReWriteStation(linkTableName)) {
         jsonObject.put("state", 0);
         jsonObject.put("SerialNumber", "Virtual"+new Date().toString());
     }else
      /*
      * 判断是否是最后的打码表用于覆盖前边的表
      */
         if (StationEnumUtil.isLastStation(linkTableName)) {
                jsonObject.put(SERIAL_ARG, serialNumber);
                clStationService.reWriteSerialNumber
                        (serialNumber,linkTableName);
        }
         /*
         剩下的就是普通的工站
          */
        else
            {
                jsonObject.put("SerialNumber", serialNumber);
            }
        logger.info(serialNumber);
        return jsonObject;
    }




}
