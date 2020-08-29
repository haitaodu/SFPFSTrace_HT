package com.smartflow.controller;

import com.smartflow.dto.VMPartProcessRecordInput;
import com.smartflow.dto.VMPartProcessRecordOutput;
import com.smartflow.dto.VMPartProcessRecordRow;
import com.smartflow.model.PartProcessRecord;
import com.smartflow.model.PartSerialNumber;
import com.smartflow.service.PartRepairRecordService;
import com.smartflow.service.PartSerialNumberService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 通过工站追溯页面__工件过站记录
 * @author admin
 *
 */

@RestController
@RequestMapping("/api/PartProcessRecord")
public class PartProcessRecordController extends BaseController{

	private static final Logger logger = Logger.getLogger(PartProcessRecordController.class);

	final
	PartSerialNumberService partSerialNumberService;
	
	final
	PartRepairRecordService partRepairRecordService;

	@Autowired
	public PartProcessRecordController(PartSerialNumberService partSerialNumberService, PartRepairRecordService partRepairRecordService) {
		this.partSerialNumberService = partSerialNumberService;
		this.partRepairRecordService = partRepairRecordService;
	}

	/**
	 * 获得记录类型下拉列表
	 * @param
	 * @return
	 */
	@CrossOrigin(origins="*",maxAge=3600)
	@RequestMapping(value="/GetPageInit",method=RequestMethod.GET)
	public Map<String, Object> getRecordType(){
		Map<String, Object> json = new HashMap<String, Object>();
		try{
			List<Map<String, Object>> recordTypeList = new ArrayList<>();
			Map<String, Object> recordType1 = new HashMap<>();
			recordType1.put("key", 1);
			recordType1.put("label", "仅显示已过工艺");
			Map<String, Object> recordType2 = new HashMap<>();
			recordType2.put("key", 2);
			recordType2.put("label", "仅显示必做工艺");
			Map<String, Object> recordType3 = new HashMap<>();
			recordType3.put("key", 3);
			recordType3.put("label", "显示全部工艺");
			recordTypeList.add(recordType1);
			recordTypeList.add(recordType2);
			recordTypeList.add(recordType3);
			json = this.setJson(200, "查询成功！", recordTypeList);
		}catch(Exception e){
			json = this.setJson(0, "查询失败："+e.getMessage(), -1);
			logger.error(e);
			e.printStackTrace();
			
		}
		return json;
	}

	/**
	 * 通过选择的站点和时间日期限定查询工件序列号
	 * @param vmPartProcessRecordInput
	 * @return
	 */

	@CrossOrigin(origins="*",maxAge=3600)
	@RequestMapping(value="/GetPartProcessRecordByPartSerialNumber",method=RequestMethod.POST)
	public Map<String, Object> getPartProcessRecordByStation(@RequestBody VMPartProcessRecordInput vmPartProcessRecordInput){
		Map<String, Object> json = new HashMap<>();
		Map<String, Object> map = new HashMap<>();
		VMPartProcessRecordOutput vmPartProcessRecordOutput = new VMPartProcessRecordOutput();
		try{
			if (vmPartProcessRecordInput.getRecordType()==null || "".equals(vmPartProcessRecordInput.getRecordType())) {
				json = this.setJson(200, "输入的记录类型不能为空！", -1);
			}
			if (vmPartProcessRecordInput.getPartSerialNumber()==null || "".equals(vmPartProcessRecordInput.getPartSerialNumber())) {
				json = this.setJson(200, "输入的工件序列号不能为空！", -1);
			}
			Integer rowCount = partSerialNumberService.getTotalCountFromPartSerialNumberBySerialNumber(vmPartProcessRecordInput);
			List<PartSerialNumber> partSerialNumberList = partSerialNumberService.getPartSerialNumberBySerialNumber(vmPartProcessRecordInput);
			List<PartSerialNumber> partSerialNumberListDesc = partSerialNumberService.getPartSerialNumberBySerialNumberDesc(vmPartProcessRecordInput);
			if(partSerialNumberListDesc != null && !partSerialNumberListDesc.isEmpty()){
				PartSerialNumber partSerialNumber = partSerialNumberListDesc.get(0);			
				if (partSerialNumber!=null) {	
					if (partSerialNumber.getWorkOrder()!=null) {
						vmPartProcessRecordOutput.setCustomerPartNumber(partSerialNumber.getWorkOrder().getBomHead().getMaterial().getCustomerMaterialNumber());
						vmPartProcessRecordOutput.setPartDescription(partSerialNumber.getWorkOrder().getBomHead().getMaterial().getDescription());
						vmPartProcessRecordOutput.setPartDrawingNumber(partSerialNumber.getWorkOrder().getBomHead().getMaterial().getCADDrawingPartNumber());
						vmPartProcessRecordOutput.setPartPartNumber(partSerialNumber.getWorkOrder().getBomHead().getMaterial().getMaterialNumber());
						vmPartProcessRecordOutput.setWorkOrderNumber(partSerialNumber.getWorkOrder().getWorkOrderNumber());
						vmPartProcessRecordOutput.setWorkOrderPlannedQuantity(partSerialNumber.getWorkOrder().getPlannedQuantity().intValue());
					}
					vmPartProcessRecordOutput.setPartState(partSerialNumber.getState()==1?"正常":"锁定");
					if (!partSerialNumber.getPackingInformations().isEmpty()) {
						vmPartProcessRecordOutput.setContainerNumber(partSerialNumber.getPackingInformations().iterator().next().getContainer().getContainerNumber());
					}
					
				}
			}
			List<VMPartProcessRecordRow> vmPartProcessRecordRowList = new ArrayList<VMPartProcessRecordRow>();
			if (partSerialNumberList!=null && !partSerialNumberList.isEmpty()) {
				for (PartSerialNumber serialNumber : partSerialNumberList) {
					if (serialNumber.getPartProcessRecords()!=null && !serialNumber.getPartProcessRecords().isEmpty()) {
						for (PartProcessRecord processRecord : serialNumber.getPartProcessRecords()) {
							VMPartProcessRecordRow vmPartProcessRecordRow = new VMPartProcessRecordRow();
							vmPartProcessRecordRow.setContainerNumber("");
							vmPartProcessRecordRow.setCycleTime(BigDecimal.valueOf(processRecord.getCycleTime()));
							vmPartProcessRecordRow.setOperatorName("");
							vmPartProcessRecordRow.setOperatorNumber("");
							if(serialNumber.getWorkOrder() != null){
								vmPartProcessRecordRow.setPartPartNumber(serialNumber.getWorkOrder().getBomHead().getMaterial().getMaterialNumber());
								vmPartProcessRecordRow.setWorkOrder(serialNumber.getWorkOrder().getWorkOrderNumber());
							}
							
							vmPartProcessRecordRow.setPartProcessCompleteDateTime(processRecord.getProductionDateTime());
							vmPartProcessRecordRow.setPartSerialNumber(serialNumber.getSerialNumber());
							vmPartProcessRecordRow.setPartState(processRecord.getProcessState() == 0 ? "PASS" : (processRecord.getProcessState() == 1 ? "FAIL" : "SCRAP"));
							vmPartProcessRecordRow.setPosition(serialNumber.getPosition());
							if(processRecord.getRepairStation() != null){
								vmPartProcessRecordRow.setRepairStationNumber(processRecord.getRepairStation().getStationNumber());
							}							
							vmPartProcessRecordRow.setStationNumber(processRecord.getStation().getStationNumber());
							vmPartProcessRecordRow.setStationName(processRecord.getStation().getName());
							vmPartProcessRecordRow.setUploadingDateTime(processRecord.getBookDateTime());
							vmPartProcessRecordRowList.add(vmPartProcessRecordRow);
						}
					}						
				}
				map.put("PartState", vmPartProcessRecordOutput.getPartState());
				map.put("CustomerPartNumber", vmPartProcessRecordOutput.getCustomerPartNumber());
				map.put("PartDescription", vmPartProcessRecordOutput.getPartDescription());
				map.put("PartDrawingNumber", vmPartProcessRecordOutput.getPartDrawingNumber());
				map.put("PartPartNumber", vmPartProcessRecordOutput.getPartPartNumber());
				map.put("WorkOrderPlannedQuantity", vmPartProcessRecordOutput.getWorkOrderPlannedQuantity());
				map.put("WorkOrderNumber", vmPartProcessRecordOutput.getWorkOrderNumber());		
				map.put("ContainerNumber", vmPartProcessRecordOutput.getContainerNumber());
				
				map.put("Tdto", vmPartProcessRecordRowList);
				map.put("RowCount", rowCount);
				json = this.setJson(200, "查询成功！", map);
			}else{
				map.put("Tdto", vmPartProcessRecordRowList);
				map.put("RowCount", rowCount);
				json = this.setJson(200, "工站序列号为空，未找到数据！", map);
			}	
		}catch(Exception e){
			json = this.setJson(0, "查询失败:"+e.getMessage(), -1);
			logger.error(e);
			e.printStackTrace();
		}
		return json;
	}
	
}
