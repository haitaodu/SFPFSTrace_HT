package com.smartflow.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.smartflow.dto.AddCLStationDeviceDTO;
import com.smartflow.model.VirtualSerialNumber;
import com.smartflow.service.CL_StationService;
import com.smartflow.service.VirtualSerialNumberService;
import com.smartflow.util.StationUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author haita
 */
@RestController
@RequestMapping("/api/CLStation")
public class ClStationController extends BaseController{

    private static Logger logger = Logger.getLogger(ClStationController.class);

    private final
    CL_StationService clStationService;

    @Autowired
    VirtualSerialNumberService virtualSerialNumberService;

    private static final int ERROR_CODE=0;
    private static final int SUCEESS_CODE=200;
    @Autowired
    public ClStationController(CL_StationService clStationService) {
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
                String serialNumber = jsonObject.get("SerialNumber") == null ? null : jsonObject.get("SerialNumber").toString();
                VirtualSerialNumber virtualSerialNumber = new VirtualSerialNumber();
                if(linkTableName.startsWith("CL_TU")){
                    if(linkTableName.equals("CL_TUOP20")){
                        virtualSerialNumber.setSerialNumber("TU_VirtualSerialNumber");
                        virtualSerialNumber.setWorkOrderId(workOrderId);
                        virtualSerialNumber.setCreationDateTime(new Date());
                        virtualSerialNumber.setEditDateTime(new Date());
                        virtualSerialNumber.setState(1);
                        virtualSerialNumberService.addVirtualSerialNumber(virtualSerialNumber);
                        jsonObject.put("SerialNumber", virtualSerialNumber.getId());
                    }else {
                        virtualSerialNumber = virtualSerialNumberService.getVirtualSerialNumberByWorkOrderId(workOrderId);
                        if((linkTableName.equals("CL_WLZPDM"))){
                            jsonObject.put("SerialNumber", virtualSerialNumber.getId());
                            if(virtualSerialNumber != null){
                                virtualSerialNumber.setEditDateTime(new Date());
                                virtualSerialNumber.setState(0);
                                virtualSerialNumber.setSerialNumber(serialNumber);
                            }
                            virtualSerialNumberService.updateVirtualSerialNumber(virtualSerialNumber);
                        }else{
                            jsonObject.put("SerialNumber", virtualSerialNumber.getId());
                        }
                    }
                }else if(linkTableName.startsWith("CL_IM")){
                    if(linkTableName.equals("CL_IMOP10") && serialNumber == null){
                        virtualSerialNumber.setSerialNumber("IM_VirtualSerialNumber");
                        virtualSerialNumber.setWorkOrderId(workOrderId);
                        virtualSerialNumber.setCreationDateTime(new Date());
                        virtualSerialNumber.setEditDateTime(new Date());
                        virtualSerialNumber.setState(1);
                        virtualSerialNumberService.addVirtualSerialNumber(virtualSerialNumber);
                        jsonObject.put("SerialNumber", virtualSerialNumber.getId());
                    }else {
                        if(serialNumber != null){
                            jsonObject.put("SerialNumber", serialNumber);
                        }else {
                            String lastStation = StationUtil.getIMLastStationName(linkTableName);
                            String serialNumberId = virtualSerialNumberService.getLastStationSerialNumber(lastStation, workOrderId);
                            jsonObject.put("SerialNumber", serialNumberId);
                        }
                    }
                }
                clStationDeviceDTO.setObject(jsonObject);
                clStationService.addCLStationDevice(className, parseToEntity(linkTableName, clStationDeviceDTO));
                json = this.setJson(SUCEESS_CODE, "添加成功！", 1);
            }
            catch (Exception e)
            {
                logger.info(e.getCause());
            }
        return json;
    }
    @SuppressWarnings("unckecked")
    private  Object parseToEntity(String linkedName,AddCLStationDeviceDTO clStationDeviceDTO) throws ClassNotFoundException {
        Class<?> classEntity=Class.forName("com.smartflow.model."+linkedName);
        return  JSON.parseObject
                (JSON.toJSONString(clStationDeviceDTO.getObject()),
                        classEntity);

    }
}
