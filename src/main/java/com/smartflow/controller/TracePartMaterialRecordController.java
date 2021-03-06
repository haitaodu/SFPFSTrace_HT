package com.smartflow.controller;

import com.alibaba.fastjson.JSONObject;
import com.smartflow.dao.PartSerialNumberDao;
import com.smartflow.service.GetPartInformationByContainerNumberService;
import com.smartflow.service.GetPartMaterialRecordByPartSerialNumberService;
import com.smartflow.service.PartSerialNumberService;
import com.smartflow.service.TracePartMaterialRecordService;
import com.smartflow.util.MaterialContainer;
import com.smartflow.util.PartInformation;
import com.smartflow.util.ReadDataUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/TracePartByMaterial")
public class TracePartMaterialRecordController extends BaseController {
	@Autowired
    TracePartMaterialRecordService tracePartMaterialRecordService;
	@Autowired
    GetPartInformationByContainerNumberService getPartInformationByContainerNumberService;
	@Autowired
    GetPartMaterialRecordByPartSerialNumberService getPartMaterialRecordByPartSerialNumberService;
	@Autowired
    PartSerialNumberService partSerialNumberService;
	@Autowired
    PartSerialNumberDao partSerialNumberDao;
	private static Logger logger = Logger.getLogger(TracePartMaterialRecordController.class);
	@CrossOrigin(origins = "*",maxAge = 3600)
	@RequestMapping(value="/GetMaterialContainerByCondition",method=RequestMethod.POST)
	public @ResponseBody Object getPages(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		JSONObject jsonObject= ReadDataUtil.paramData(request);
		int pageSize=jsonObject.getIntValue("PageSize");
		int pageIndex=jsonObject.getIntValue("PageIndex");
		String containerNumber = jsonObject.getString("ContainerNumber")==null?null:jsonObject.getString("ContainerNumber");
		String materialPartNumber = jsonObject.getString("MaterialPartNumber")==null?null:jsonObject.getString("MaterialPartNumber");
		String supplierCode = jsonObject.getString("SupplierCode")==null?null:jsonObject.getString("SupplierCode");
		String batchNumber = jsonObject.getString("BatchNumber")==null?null:jsonObject.getString("BatchNumber");
		String supplierMaterialPartNumber = jsonObject.getString("SupplierMaterialPartNumber")==null?null:jsonObject.getString("SupplierMaterialPartNumber");
		Map<String, Object> json=new HashMap<String,Object>();
		List<MaterialContainer> pagedata=tracePartMaterialRecordService.getDataForMaterialRecord(containerNumber, materialPartNumber, supplierCode, batchNumber, supplierMaterialPartNumber, pageIndex, pageSize);
		Map<String, Object> map=new HashMap<String,Object>();
	
		map.put("Tdto", pagedata);
        map.put("RowCount", tracePartMaterialRecordService.getCountData(containerNumber, materialPartNumber, supplierCode, batchNumber, supplierMaterialPartNumber, pageIndex, pageSize));
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
	@RequestMapping(value="/GetPartInformationListByContainerNumber",method=RequestMethod.POST)
	public @ResponseBody Object getPartInformation(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		JSONObject jsonObject= ReadDataUtil.paramData(request);
		//int pageSize=jsonObject.getIntValue("PageSize");
		//int pageIndex=jsonObject.getIntValue("PageIndex");
		String containerNumber = jsonObject.getString("ContainerNumber")==null?null:jsonObject.getString("ContainerNumber");
		getPartInformationByContainerNumberService.init();
		Map<String, Object> json=new HashMap<String,Object>();

		List<PartInformation> partInformations=getPartInformationByContainerNumberService.getPartInformation(containerNumber);
		Map<String, Object> map=new HashMap<String,Object>();
	 
	    
	
		map.put("Tdto", partInformations);
	    
	    //map.put("RowCount",getPartInformationByContainerNumberService.getRowCountInChosenContainerNumber(containerNumber)+2);
        
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
	@RequestMapping(value="/GetPartMaterialRecordByPartSerialNumber",method=RequestMethod.POST)
	public @ResponseBody Object getPartMaterialRecordByPartSerialNumber(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		JSONObject jsonObject= ReadDataUtil.paramData(request);
	
		
		Map<String, Object> json=new HashMap<String,Object>();
	
		Map<String, Object> map=new HashMap<String,Object>();
		String serialNumber = jsonObject.getString("SerialNumber")==null?null:jsonObject.getString("SerialNumber");
		
       // map.put("RowCount", tracePartMaterialRecordService.getCountData(containerNumber, materialPartNumber, supplierCode, batchNumber, supplierMaterialPartNumber, pageIndex, pageSize));
		getPartMaterialRecordByPartSerialNumberService.init();
		map.put("Tdto", getPartMaterialRecordByPartSerialNumberService.getPartMaterialRecordById(serialNumber));
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
@RequestMapping(value="/GetPartMaterialRecordByWorkOrderNumber",method=RequestMethod.POST)
public @ResponseBody Object getPartMaterialRecordByWorkOrderNumber(HttpServletRequest request, HttpServletResponse response) throws Exception
{
	JSONObject jsonObject= ReadDataUtil.paramData(request);
	
	
	Map<String, Object> json=new HashMap<String,Object>();

	Map<String, Object> map=new HashMap<String,Object>();
	String workOrderNumber = jsonObject.getString("WorkOrderNumber")==null?null:jsonObject.getString("WorkOrderNumber");
	int pageSize=jsonObject.getIntValue("PageSize");
	int pageIndex=jsonObject.getIntValue("PageIndex");
	map.put("Tdto",partSerialNumberService.getPartSerialNumberByWorkOrder(pageIndex, pageSize, workOrderNumber) );
	map.put("RowCount",partSerialNumberService.countByWorkOrder(pageIndex, pageSize, workOrderNumber));
	System.out.println("输出序列号"+partSerialNumberDao.getPartSerialNumberByParentSerialNumberId(341));
	try {
		json= this.setJson(200, "Success", map);
	} catch (Exception e) {
		json = this.setJson(0, e.getMessage(),1);
		logger.error(e);
		e.printStackTrace();
	}
	return json;
}
}