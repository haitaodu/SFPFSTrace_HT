package com.smartflow.controller;

import com.smartflow.dto.GetStationTestResultBySerialNumberDTO;
import com.smartflow.dto.StationLinkTableNameDTO;
import com.smartflow.service.CL_StationService;
import com.smartflow.service.StationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @CrossOrigin(origins="*",maxAge=3600)
    @PostMapping(value="/GetStationTestResultBySerialNumber")
    public Map<String, Object> getStationTestResultBySerialNumber(@RequestBody GetStationTestResultBySerialNumberDTO getStationTestResultBySerialNumberDTO) {
        Map<String,Object> json = new HashMap<>();
        String cellNumber = null;
        String serailNumber = null;
        if(!StringUtils.isEmpty(getStationTestResultBySerialNumberDTO.getTUSerialNumber())){
            cellNumber = "TU";
            serailNumber = getStationTestResultBySerialNumberDTO.getTUSerialNumber();
        }else if(!StringUtils.isEmpty(getStationTestResultBySerialNumberDTO.getIMSerialNumber())){
            cellNumber = "IM";
            serailNumber = getStationTestResultBySerialNumberDTO.getIMSerialNumber();
        }else if(!StringUtils.isEmpty(getStationTestResultBySerialNumberDTO.getRESerialNumber())){
            cellNumber = "RE";
            serailNumber = getStationTestResultBySerialNumberDTO.getRESerialNumber();
        }else if(!StringUtils.isEmpty(getStationTestResultBySerialNumberDTO.getPDSerialNumber())){
            cellNumber = "PD";
            serailNumber = getStationTestResultBySerialNumberDTO.getPDSerialNumber();
        }else if(!StringUtils.isEmpty(getStationTestResultBySerialNumberDTO.getFCSerialNumber())){
            cellNumber = "FC";
            serailNumber = getStationTestResultBySerialNumberDTO.getFCSerialNumber();
        }
        if(cellNumber != null){
            List<StationLinkTableNameDTO> stationLinkTableNameList = stationService.getStationLinkTableNameByCell(cellNumber);
            List<Map<String,Object>> mapList = cl_stationService.getStationTestResultBySerialNumberAndLinkTableName(serailNumber, stationLinkTableNameList);
            json = this.setJson(200, "查询成功", mapList);
        }else{
            json = this.setJson(0, "查询失败：请输入条码！", -1);
        }
        return json;
    }
}
