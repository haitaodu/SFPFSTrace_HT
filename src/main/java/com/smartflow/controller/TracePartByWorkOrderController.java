package com.smartflow.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.smartflow.service.GetPartInformationByContainerNumberService;
import com.smartflow.service.GetPartMaterialRecordByPartSerialNumberService;
import com.smartflow.service.PartSerialNumberService;
import com.smartflow.service.TracePartMaterialRecordService;
import com.smartflow.util.ReadDataUtil;

@Controller
@RequestMapping("/api/TracePartByWorkOrder")
public class TracePartByWorkOrderController extends BaseController{
	@Autowired
	TracePartMaterialRecordService tracePartMaterialRecordService;
	@Autowired
	GetPartInformationByContainerNumberService getPartInformationByContainerNumberService;
	@Autowired
	GetPartMaterialRecordByPartSerialNumberService getPartMaterialRecordByPartSerialNumberService;
	@Autowired
	PartSerialNumberService partSerialNumberService;
	
	private static Logger logger = Logger.getLogger(TracePartMaterialRecordController.class);
	

@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping(value="/GetPartMaterialRecordByWorkOrderNumber",method=RequestMethod.POST)
public @ResponseBody Object getPartMaterialRecordByWorkOrderNumber(HttpServletRequest request,HttpServletResponse response) throws Exception
{
	JSONObject jsonObject=ReadDataUtil.paramData(request);
	
	
	Map<String, Object> json=new HashMap<String,Object>();

	Map<String, Object> map=new HashMap<String,Object>();
	String workOrderNumber = jsonObject.getString("WorkOrderNumber")==null?null:jsonObject.getString("WorkOrderNumber");
	int pageSize=jsonObject.getIntValue("PageSize");
	int pageIndex=jsonObject.getIntValue("PageIndex");
	map.put("Tdto",partSerialNumberService.getPartSerialNumberByWorkOrder(pageIndex, pageSize, workOrderNumber) );
	map.put("RowCount",partSerialNumberService.countByWorkOrder(pageIndex, pageSize, workOrderNumber));

	try {
		json= this.setJson(200, "Success", map);
	} catch (Exception e) {
		json = this.setJson(0, e.getMessage(),1);
		logger.error(e);
		e.printStackTrace();
	}
	return json;
}
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping(value="/GetPartMaterialRecordByPartSerialNumberId/{Id}",method=RequestMethod.GET)
public @ResponseBody Object getPartMaterialRecordByPartSerialNumberId(@PathVariable Integer Id) throws Exception
{
	
	
	
	Map<String, Object> json=new HashMap<String,Object>();

	Map<String, Object> map=new HashMap<String,Object>();
	try {
	partSerialNumberService.init();
	//System.out.println("输出序列号"+partSerialNumberDao.getPartSerialNumberByParentSerialNumberId(341));
	
	map.put("Tdto", partSerialNumberService.getPartSerialNumberByParentSerialNumberId(Id));
	json=this.setJson(200, "success", map);
	} catch (Exception e) {
		json = this.setJson(0, e.getMessage(),1);
		logger.error(e);
		e.printStackTrace();
	}
	return json;
}
}