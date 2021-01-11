package com.smartflow.controller;

import com.smartflow.common.stationenum.CellEnum;
import com.smartflow.common.stationenum.StationNameIm;
import com.smartflow.dto.*;
import com.smartflow.service.CL_StationService;
import com.smartflow.service.StationService;
import com.smartflow.util.StationUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: WJJ
 * @Description:
 * @Date: 2020-12-28 11:14
 **/
@RestController
@RequestMapping("/api/TraceStationTestResultBySerialNumber")
public class TraceStationTestResultBySerialNumberController extends BaseController{

    private static final Logger logger = Logger.getLogger(TraceStationTestResultBySerialNumberController.class);
    @Autowired
    StationService stationService;
    @Autowired
    CL_StationService cl_stationService;

    /**
     * 获取岛区条码下拉框
     * @return 返回初始化的下拉列表
     */
    @CrossOrigin(origins="*",maxAge=3600)
    @GetMapping (value="/GetCellSerialNumberListInit")
    public Map<String, Object> getCellSerialNumberList(){
        Map<String,Object> json = new HashMap<>();
        try{
            Map<String,Object> map = new HashMap<>();
            List<Map<String,Object>> cellList = new ArrayList<>();
            for (CellEnum cellEnum:CellEnum.values())
            {
                Map<String,Object> cellMap = new HashMap<>();
                cellMap.put("key", cellEnum.getKey());
                cellMap.put("label", cellEnum.getLabel());
                cellList.add(cellMap);
            }
            map.put("CellSerialNumberList", cellList);
            json = this.setJson(200, "初始化成功", map);
        }catch(Exception e){
            json = this.setJson(0, "查询失败："+e.getMessage(), -1);
            logger.error(e.getCause());
        }
        return json;
    }

    @CrossOrigin(origins="*",maxAge=3600)
    @PostMapping(value="/GetStationTestResultBySerialNumber")
    public Map<String, Object> getStationTestResultBySerialNumber(@RequestBody GetStationTestResultBySerialNumberDTO getStationTestResultBySerialNumberDTO) {
        Map<String,Object> json = new HashMap<>();
        String cellNumber = getStationTestResultBySerialNumberDTO.getCellNumber();
        String serialNumber = getStationTestResultBySerialNumberDTO.getSerialNumber();
        try{

//        String serailNumber = null;
//        if(!StringUtils.isEmpty(getStationTestResultBySerialNumberDTO.getTUSerialNumber())){
//            cellNumber = "TU";
//            serailNumber = getStationTestResultBySerialNumberDTO.getTUSerialNumber();
//        }else if(!StringUtils.isEmpty(getStationTestResultBySerialNumberDTO.getIMSerialNumber())){
//            cellNumber = "IM";
//            serailNumber = getStationTestResultBySerialNumberDTO.getIMSerialNumber();
//        }else if(!StringUtils.isEmpty(getStationTestResultBySerialNumberDTO.getRESerialNumber())){
//            cellNumber = "RE";
//            serailNumber = getStationTestResultBySerialNumberDTO.getRESerialNumber();
//        }else if(!StringUtils.isEmpty(getStationTestResultBySerialNumberDTO.getPDSerialNumber())){
//            cellNumber = "PD";
//            serailNumber = getStationTestResultBySerialNumberDTO.getPDSerialNumber();
//        }else if(!StringUtils.isEmpty(getStationTestResultBySerialNumberDTO.getFCSerialNumber())){
//            cellNumber = "FC";
//            serailNumber = getStationTestResultBySerialNumberDTO.getFCSerialNumber();
//        }
            if(StringUtils.isEmpty(cellNumber)){
                json = this.setJson(0, "查询失败：请选择岛区条码！", -1);
                return json;
            }
            if(StringUtils.isEmpty(serialNumber)){
                json = this.setJson(0, "查询失败：请输入条码！", -1);
                return json;
            }
            StationUtil stationUtil = new StationUtil();
            List<StationTestResultHeaderDTO> headerList = new ArrayList<>();
            List<Map<String,Object>> TUDataList = new ArrayList<>();
            List<Map<String,Object>> IMDataList = new ArrayList<>();
            List<Map<String,Object>> REDataList = new ArrayList<>();
            List<Map<String,Object>> PDDataList = new ArrayList<>();
            List<Map<String,Object>> FCDataList = new ArrayList<>();
            List<Map<String,Object>> TCDataList = new ArrayList<>();
            Map<String,Object> response = new HashMap<>();
            if(!cellNumber.equals("TU")){
                CellSerialNumberDTO cellSerialNumberDTO = cl_stationService.getCellSerialNumberDTOFromTCOP10(cellNumber, serialNumber);
                if(cellSerialNumberDTO != null){
                    CellSerialNumberDTO TUCellSerialNumberDTO = cl_stationService.getTUOrPDSerialNumberFromCOMOP10(cellSerialNumberDTO, cellNumber);
                    if(TUCellSerialNumberDTO != null){
                        cellSerialNumberDTO.setTUSerialNumber(TUCellSerialNumberDTO.getTUSerialNumber());
                        TUDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName("TU", cellSerialNumberDTO.getTUSerialNumber(), stationService.getStationLinkTableNameByCell("TU"), false);
                    }
                    headerList = stationUtil.getStationTestResultHeaderList();
                    IMDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName("IM",cellSerialNumberDTO.getIMSerialNumber(), stationService.getStationLinkTableNameByCell("IM"), false);
                    REDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName("RE",cellSerialNumberDTO.getRESerialNumber(), stationService.getStationLinkTableNameByCell("RE"), false);
                    PDDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName("PD",cellSerialNumberDTO.getPDSerialNumber(), stationService.getStationLinkTableNameByCell("PD"), false);
                    FCDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName("FC",cellSerialNumberDTO.getTUSerialNumber(), stationService.getStationLinkTableNameByCell("FC"), false);
                    TCDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName(cellNumber,serialNumber, stationService.getStationLinkTableNameByCell("TC"), true);

                    int maxSize = TUDataList.size() > IMDataList.size() ? TUDataList.size() : IMDataList.size();
                    maxSize = maxSize > REDataList.size() ? maxSize : REDataList.size();
                    maxSize = maxSize > PDDataList.size() ? maxSize : PDDataList.size();
                    maxSize = maxSize > FCDataList.size() ? maxSize : FCDataList.size();
                    maxSize = maxSize > TCDataList.size() ? maxSize : TCDataList.size();
                    TUDataList = stationUtil.getCellDataListByMaxSize(TUDataList, maxSize, "TU");
                    IMDataList = stationUtil.getCellDataListByMaxSize(IMDataList, maxSize, "IM");
                    REDataList = stationUtil.getCellDataListByMaxSize(REDataList, maxSize, "RE");
                    PDDataList = stationUtil.getCellDataListByMaxSize(PDDataList, maxSize, "PD");
                    FCDataList = stationUtil.getCellDataListByMaxSize(FCDataList, maxSize, "FC");
                    TCDataList = stationUtil.getCellDataListByMaxSize(TCDataList, maxSize, "TC");
                    List<Map<String,Object>> dataList = stationUtil.getDataListByAllCellDataList(TUDataList, IMDataList, REDataList, PDDataList, FCDataList, TCDataList);
                    response.put("DataList", dataList);
                }else{
                    switch (cellNumber){
                        case "IM":
                            headerList.add(new StationTestResultHeaderDTO("泵轮岛区", stationUtil.getStationTestResultHeaderChildrenList("IM")));
                            IMDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName("IM",serialNumber, stationService.getStationLinkTableNameByCell("IM"), false);
                            response.put("DataList", IMDataList);
                            break;
                        case "RE":
                            headerList.add(new StationTestResultHeaderDTO("导轮岛区", stationUtil.getStationTestResultHeaderChildrenList("RE")));
                            REDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName("RE",serialNumber, stationService.getStationLinkTableNameByCell("RE"), false);
                            response.put("DataList", REDataList);
                            break;
                        case "PD":
                            headerList.add(new StationTestResultHeaderDTO("闭锁岛区", stationUtil.getStationTestResultHeaderChildrenList("PD")));
                            PDDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName("PD",serialNumber, stationService.getStationLinkTableNameByCell("PD"), false);
                            response.put("DataList", PDDataList);
                            break;
                        case "FC":
                            headerList.add(new StationTestResultHeaderDTO("罩轮岛区", stationUtil.getStationTestResultHeaderChildrenList("FC")));
                            FCDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName("FC",serialNumber, stationService.getStationLinkTableNameByCell("FC"), false);
                            response.put("DataList", FCDataList);
                            break;
                    }
                }
            }else{
                //根据TU条码查询闭锁条码
                CellSerialNumberDTO cellSerialNumberDTO = new CellSerialNumberDTO();
                cellSerialNumberDTO.setTUSerialNumber(serialNumber);
                CellSerialNumberDTO PDCellSerialNumberDTO = cl_stationService.getTUOrPDSerialNumberFromCOMOP10(cellSerialNumberDTO, cellNumber);
                if(PDCellSerialNumberDTO != null){
                    cellSerialNumberDTO.setPDSerialNumber(PDCellSerialNumberDTO.getPDSerialNumber());
                    PDDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName("PD",cellSerialNumberDTO.getPDSerialNumber(), stationService.getStationLinkTableNameByCell("PD"), false);
                    cellSerialNumberDTO = cl_stationService.getCellSerialNumberDTOFromTCOP10(cellNumber, cellSerialNumberDTO.getPDSerialNumber());
                    if(cellSerialNumberDTO != null){
                        headerList = stationUtil.getStationTestResultHeaderList();
                        TUDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName("TU", cellSerialNumberDTO.getTUSerialNumber(), stationService.getStationLinkTableNameByCell("TU"), false);
                        IMDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName("IM",cellSerialNumberDTO.getIMSerialNumber(), stationService.getStationLinkTableNameByCell("IM"), false);
                        REDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName("RE",cellSerialNumberDTO.getRESerialNumber(), stationService.getStationLinkTableNameByCell("RE"), false);
                        FCDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName("FC",cellSerialNumberDTO.getFCSerialNumber(), stationService.getStationLinkTableNameByCell("FC"), false);
                        TCDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName(cellNumber,serialNumber, stationService.getStationLinkTableNameByCell("TC"), true);

                        //获取集合中size最大值
                        int maxSize = TUDataList.size() > IMDataList.size() ? TUDataList.size() : IMDataList.size();
                        maxSize = maxSize > REDataList.size() ? maxSize : REDataList.size();
                        maxSize = maxSize > PDDataList.size() ? maxSize : PDDataList.size();
                        maxSize = maxSize > FCDataList.size() ? maxSize : FCDataList.size();
                        maxSize = maxSize > TCDataList.size() ? maxSize : TCDataList.size();
                        //根据集合中size最大的补齐小于size最大值的集合
                        TUDataList = stationUtil.getCellDataListByMaxSize(TUDataList, maxSize, "TU");
                        IMDataList = stationUtil.getCellDataListByMaxSize(IMDataList, maxSize, "IM");
                        REDataList = stationUtil.getCellDataListByMaxSize(REDataList, maxSize, "RE");
                        PDDataList = stationUtil.getCellDataListByMaxSize(PDDataList, maxSize, "PD");
                        FCDataList = stationUtil.getCellDataListByMaxSize(FCDataList, maxSize, "FC");
                        TCDataList = stationUtil.getCellDataListByMaxSize(TCDataList, maxSize, "TC");
                        List<Map<String,Object>> dataList = stationUtil.getDataListByAllCellDataList(TUDataList, IMDataList, REDataList, PDDataList, FCDataList, TCDataList);
                        response.put("DataList", dataList);
                    }
                }else{
                    headerList.add(new StationTestResultHeaderDTO("涡轮岛区", stationUtil.getStationTestResultHeaderChildrenList(cellNumber)));
                    TUDataList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName(cellNumber, cellSerialNumberDTO.getTUSerialNumber(), stationService.getStationLinkTableNameByCell(cellNumber), false);
                    response.put("DataList", TUDataList);
                }
            }
            response.put("HeaderList", headerList);
            json = this.setJson(200, "查询成功", response);
        }catch (Exception e){
            json = this.setJson(0, "查询失败："+e.getMessage(), -1);
        }
        return json;

    }
}
