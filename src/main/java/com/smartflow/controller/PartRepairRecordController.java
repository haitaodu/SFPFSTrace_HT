package com.smartflow.controller;

import com.smartflow.dto.VMPartRepairDetailInput;
import com.smartflow.dto.VMPartRepairDetailOutput;
import com.smartflow.dto.VMPartRepairRecordInput;
import com.smartflow.dto.VMPartRepairRecordOutput;
import com.smartflow.model.PartFailureDataRecord;
import com.smartflow.model.PartRepairQualityCheckRecord;
import com.smartflow.model.PartRepairRecord;
import com.smartflow.model.PartSerialNumber;
import com.smartflow.service.PartRepairRecordService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author haita
 */
@RestController
@RequestMapping("/api/PartRepairRecord")
public class PartRepairRecordController extends BaseController{
	
	final
    PartRepairRecordService partRepairRecordService;
	
	private static final Logger logger = Logger.getLogger(PartRepairRecordController.class);

    @Autowired
    public PartRepairRecordController(PartRepairRecordService partRepairRecordService) {
        this.partRepairRecordService = partRepairRecordService;
    }

    /**
	 * 工件维修记录页面-获取维修记录信息
	 * @param vmPartRepairRecordInput
	 * @return
	 */
	@CrossOrigin(origins="*",maxAge=3600)
	@PostMapping (value="/GetPartRepairRecordByPartSerialNumber")
	public Map<String, Object> getPartRepairRecordByPartSerialNumber(@RequestBody VMPartRepairRecordInput vmPartRepairRecordInput){
		Map<String, Object> json = new HashMap<>();
		Map<String, Object> map = new HashMap<>();
		List<VMPartRepairRecordOutput> vmPartRepairRecordOutputList = new ArrayList<>();
		try{
			if(vmPartRepairRecordInput.getPartSerialNumber() == null || "".equals(vmPartRepairRecordInput.getPartSerialNumber())){
				json = this.setJson(200, "工件序列号不能为空！", -1);
				return json;
			}
			List<PartSerialNumber> partSerialNumberList = partRepairRecordService.getPartSerialNumberBySerialNumber(vmPartRepairRecordInput);
			if (partSerialNumberList!=null && !partSerialNumberList.isEmpty()) {
				for (PartSerialNumber partSerialNumber : partSerialNumberList) {
					if (partSerialNumber.getWorkOrder()!=null) {
						map.put("CustomerPartNumber", partSerialNumber.getWorkOrder().getBomHead().getMaterial().getCustomerMaterialNumber());
						map.put("PartDescription", partSerialNumber.getWorkOrder().getBomHead().getMaterial().getDescription());
						map.put("PartDrawingNumber", partSerialNumber.getWorkOrder().getBomHead().getMaterial().getCADDrawingPartNumber());
						map.put("PartPartNumber", partSerialNumber.getWorkOrder().getBomHead().getMaterial().getMaterialNumber());
						map.put("WorkOrderPlannedQuantity", partSerialNumber.getWorkOrder().getPlannedQuantity().intValue());	
						map.put("WorkOrderNumber", partSerialNumber.getWorkOrder().getWorkOrderNumber());
					}				
					map.put("PartState", partSerialNumber.getState()==1?"正常":"锁定");					
				}
			}			
			Integer rowCount = partRepairRecordService.getTotalCountFromPartRepairRecordBySerialNumber(vmPartRepairRecordInput);
			List<PartRepairRecord> partRepairRecordList = partRepairRecordService.getPartRepairRecordBySerialNumber(vmPartRepairRecordInput);
			if (partRepairRecordList!=null && !partRepairRecordList.isEmpty()) {
				for (PartRepairRecord partRepairRecord : partRepairRecordList) {
					VMPartRepairRecordOutput vmPartRepairRecordOutput = new VMPartRepairRecordOutput();
					vmPartRepairRecordOutput.setOperatorName(partRepairRecord.getUser().getUserName());
					vmPartRepairRecordOutput.setOperatorNumber(partRepairRecord.getUser().getUserCode());
					vmPartRepairRecordOutput.setPartPartNumber(partRepairRecord.getPartFailureDataRecord().getPartSerialNumber().getWorkOrder().getBomHead().getMaterial().getMaterialNumber());
					vmPartRepairRecordOutput.setPartSerialNumber(partRepairRecord.getPartFailureDataRecord().getPartSerialNumber().getSerialNumber());
					vmPartRepairRecordOutput.setPartState(partRepairRecord.getPartFailureDataRecord().getPartSerialNumber().getState()==1?"正常":"锁定");
					vmPartRepairRecordOutput.setPosition(partRepairRecord.getPartFailureDataRecord().getPartSerialNumber().getPosition());
					vmPartRepairRecordOutput.setWorkOrder(partRepairRecord.getPartFailureDataRecord().getPartSerialNumber().getWorkOrder().getWorkOrderNumber());
					PartRepairQualityCheckRecord partRepairQualityCheckRecord = partRepairRecordService.getPartRepairQualityCheckRecordByPartRepairRecordId(partRepairRecord.getId());
					if(partRepairQualityCheckRecord != null){
						vmPartRepairRecordOutput.setQualityPersonName(partRepairQualityCheckRecord.getUser().getUserName());
						vmPartRepairRecordOutput.setQualityPersonNumber(partRepairQualityCheckRecord.getUser().getUserCode());
				    	vmPartRepairRecordOutput.setQuanlityConfirmDateTime(partRepairQualityCheckRecord.getCreationDateTime());
				    	String checkState = "";
				    	if(partRepairQualityCheckRecord.getCheckState() == 0){
				    		checkState = "合格";
				    	}else if(partRepairQualityCheckRecord.getCheckState() == 1){
				    		checkState = "返修";
				    	}else if(partRepairQualityCheckRecord.getCheckState() == 2){
				    		checkState = "报废";
				    	}
				    	vmPartRepairRecordOutput.setCheckState(checkState);
					}
					vmPartRepairRecordOutput.setRepairDateTime(partRepairRecord.getCreationDateTime());
					vmPartRepairRecordOutput.setRepairRecordId(partRepairRecord.getId());
					if(partRepairRecord.getStation() != null){
						vmPartRepairRecordOutput.setRepairStationNumber(partRepairRecord.getStation().getStationNumber());
					}					
					vmPartRepairRecordOutput.setStationName(partRepairRecord.getPartFailureDataRecord().getStation().getName());
					vmPartRepairRecordOutput.setStationNumber(partRepairRecord.getPartFailureDataRecord().getStation().getStationNumber());
					vmPartRepairRecordOutputList.add(vmPartRepairRecordOutput);
				}
			}			
			map.put("RowCount", rowCount);
			map.put("Tdto", vmPartRepairRecordOutputList);
			json = this.setJson(200, "查询成功!", map);
		}catch(Exception e){
			json = this.setJson(0, "查询失败："+e.getMessage(), -1);
			logger.error(e);
			e.printStackTrace();
		}		
		return json;
	}
	

	/**
	 * 工件维修记录页面-获取维修记录详情
	 * @return
	 */
	@CrossOrigin(origins="*",maxAge=3600)
	@RequestMapping(value="/GetPartRepairDetailByRepairRecordId",method=RequestMethod.POST)
	public Map<String, Object> GetPartRepairDetailByRepairRecordId(@RequestBody VMPartRepairDetailInput vmPartRepairDetailInput){
		Map<String, Object> json = new HashMap<>();
		Map<String, Object> map = new HashMap<>();
		List<VMPartRepairDetailOutput> vmPartRepairDetailOutputList = new ArrayList<VMPartRepairDetailOutput>();
		try{
			if(vmPartRepairDetailInput.getRepairRecordId() == null || "".equals(vmPartRepairDetailInput.getRepairRecordId())){
				json = this.setJson(200, "维修记录编号不能为空！", -1);
				return json;
			}		
			Integer rowCount = partRepairRecordService.getTotalCountFromPartFailureDataRecordByPartRepairRecordId(vmPartRepairDetailInput.getRepairRecordId());
			List<PartFailureDataRecord> partFailureDataRecords = partRepairRecordService.getPartFailureDataRecordByPartRepairRecordId(vmPartRepairDetailInput.getRepairRecordId());
			if(partFailureDataRecords != null && !partFailureDataRecords.isEmpty()){
				for (PartFailureDataRecord partFailureDataRecord : partFailureDataRecords) {
					VMPartRepairDetailOutput vmPartRepairDetailOutput =  new VMPartRepairDetailOutput();
					vmPartRepairDetailOutput.setDesignator(partFailureDataRecord.getDesignator());
					if(partFailureDataRecord.getFailureCause() != null){
						vmPartRepairDetailOutput.setFailureCauseName(partFailureDataRecord.getFailureCause().getName());
					}	
					vmPartRepairDetailOutput.setFailureTypeName(partFailureDataRecord.getFailureType().getName());
					//vmPartRepairDetailOutput.setMaterialPartNumber(partFailureDataRecord.getPartSerialNumber().getWorkOrder().getBomHead().getMaterial().getMaterialNumber());	
					vmPartRepairDetailOutput.setMaterialPartNumber(partFailureDataRecord.getComponentPartNumber());
					vmPartRepairDetailOutput.setRepairRecordId(partFailureDataRecord.getId());
					PartRepairRecord partRepairRecord = partFailureDataRecord.getPartRepairRecord();
					if(partRepairRecord != null){						
						vmPartRepairDetailOutput.setIsRepaired(partRepairRecord.getRepairState()==0?false:true);
						vmPartRepairDetailOutput.setMachineOperatorCode(partRepairRecord.getUser().getUserCode());
						vmPartRepairDetailOutput.setMachineOperatorName(partRepairRecord.getUser().getUserName());
						if(partRepairRecord.getRepairAction() != null){
							vmPartRepairDetailOutput.setRepairActionName(partRepairRecord.getRepairAction().getName());
						}	
						vmPartRepairDetailOutput.setRepairDateTime(partRepairRecord.getCreationDateTime());
						String repairState = null;
						Integer repair_State = partRepairRecord.getRepairState();
						if(repair_State == 0){
							repairState = "维修完成";
						}else if(repair_State == 2){
							repairState = "报废";
						}
						vmPartRepairDetailOutput.setRepairState(repairState);								
					}else{//PartFailureDataRecord表中的字段Id在PartRepairRecord中没有数据，就是未维修
						vmPartRepairDetailOutput.setRepairState("未维修");
					}					
					//根据工件维修记录id查询工件维修质量判定记录(根据时间倒叙排列取第一条数据)
					PartRepairQualityCheckRecord partRepairQualityCheckRecord = partRepairRecordService.getPartRepairQualityCheckRecordByPartRepairRecordId(partRepairRecord.getId());
					if(partRepairQualityCheckRecord != null){
						vmPartRepairDetailOutput.setQualityConfirmDateTime(partRepairQualityCheckRecord.getCreationDateTime());
					}					
					vmPartRepairDetailOutputList.add(vmPartRepairDetailOutput);					
				}
			}
			map.put("RowCount", rowCount);
			map.put("Tdto", vmPartRepairDetailOutputList);
			json = this.setJson(200, "查询成功！", map);
		}catch(Exception e){
			json = this.setJson(0, "查询失败:"+e.getMessage(), -1);
			logger.error(e);
			e.printStackTrace();
		}
		return json;		
	}
		
}
