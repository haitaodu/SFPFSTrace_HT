package com.smartflow.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.smartflow.dao.PartSerialNumberDao;
import com.smartflow.service.GetPartInformationByContainerNumberService;
import com.smartflow.service.GetPartMaterialRecordByPartSerialNumberService;
import com.smartflow.service.PartSerialNumberService;
import com.smartflow.service.TracePartMaterialRecordService;
import com.smartflow.util.MaterialRecordOutput;
import com.smartflow.util.ReadDataUtil;

/**
 * @author haita
 */
@Controller
@RequestMapping("/api/PartMaterialRecord")
public class PartMaterialRecordController extends BaseController {
    final
    TracePartMaterialRecordService tracePartMaterialRecordService;
    final
    GetPartInformationByContainerNumberService getPartInformationByContainerNumberService;
    final
    GetPartMaterialRecordByPartSerialNumberService getPartMaterialRecordByPartSerialNumberService;
    final
    PartSerialNumberService partSerialNumberService;
    final
    PartSerialNumberDao partSerialNumberDao;
    private static Logger logger = Logger.getLogger(TracePartMaterialRecordController.class);

    @Autowired
    public PartMaterialRecordController(TracePartMaterialRecordService tracePartMaterialRecordService, GetPartInformationByContainerNumberService getPartInformationByContainerNumberService, GetPartMaterialRecordByPartSerialNumberService getPartMaterialRecordByPartSerialNumberService, PartSerialNumberService partSerialNumberService, PartSerialNumberDao partSerialNumberDao) {
        this.tracePartMaterialRecordService = tracePartMaterialRecordService;
        this.getPartInformationByContainerNumberService = getPartInformationByContainerNumberService;
        this.getPartMaterialRecordByPartSerialNumberService = getPartMaterialRecordByPartSerialNumberService;
        this.partSerialNumberService = partSerialNumberService;
        this.partSerialNumberDao = partSerialNumberDao;
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/GetPartMaterialRecordByPartSerialNumber", method = RequestMethod.POST)
    public @ResponseBody
    Object getPartMaterialRecordByPartSerialNumber(HttpServletRequest request, HttpServletResponse response) throws Exception {
        JSONObject jsonObject = ReadDataUtil.paramData(request);
        Map<String, Object> json;
        Map<String, Object> map = new HashMap<>();
        String serialNumber = jsonObject.getString("SerialNumber") == null ? null : jsonObject.getString("SerialNumber");
        System.out.println(serialNumber);
        getPartMaterialRecordByPartSerialNumberService.init();
        MaterialRecordOutput materialRecordOutput = getPartMaterialRecordByPartSerialNumberService.getPartMaterialRecordById(serialNumber);
        if (materialRecordOutput == null) {
            map.put("Tdto", new ArrayList<>());
        } else {
            map.put("SessionId", request.getSession().getId());

            map.put("Tdto", materialRecordOutput.getPartMaterialRecordRowData());
            map.put("CustomerPartNumber", materialRecordOutput.getCustomerPartNumber());
            map.put("Description", materialRecordOutput.getPartDescription());
            map.put("DrawingNumber", materialRecordOutput.getPartDrawingNumber());
            map.put("PartPartNumber", materialRecordOutput.getPartPartNumber());
            map.put("PartState", materialRecordOutput.getPartState());
            map.put("WorkOrderNumber", materialRecordOutput.getWorkOrderNumber());
            map.put("WorkOrderPlannedQuantity", materialRecordOutput.getWorkOrderPlannedQuantity());
            map.put("ContainerNumber", materialRecordOutput.getContainerNumber());
        }
        try {
            json = this.setJson(200, "Success", map);
        } catch (Exception e) {
            json = this.setJson(0, e.getMessage(), 1);
            logger.error(e);
        }
        return json;

    }
}