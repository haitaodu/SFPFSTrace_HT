package com.smartflow.controller;

import com.smartflow.dto.VMFinishGoodBoxPartInformationRow;
import com.smartflow.dto.VMPartInformationOfFinishGoodBoxInput;
import com.smartflow.model.PackingInformation;
import com.smartflow.service.GetPartMaterialRecordByPartSerialNumberService;
import com.smartflow.service.PackingInformationService;
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
@RequestMapping("/api/TracePartByFinishGoodBoxNumber")
public class TracePartByFinishGoodBoxNumberController extends BaseController{
	private static final Logger logger = Logger.getLogger(TracePartByFinishGoodBoxNumberController.class);

	private final
	GetPartMaterialRecordByPartSerialNumberService getPartMaterialRecordByPartSerialNumberService;
	private final
	PackingInformationService packingInformationService;

	@Autowired
	public TracePartByFinishGoodBoxNumberController(GetPartMaterialRecordByPartSerialNumberService getPartMaterialRecordByPartSerialNumberService, PackingInformationService packingInformationService) {
		this.getPartMaterialRecordByPartSerialNumberService = getPartMaterialRecordByPartSerialNumberService;
		this.packingInformationService = packingInformationService;
	}

	@CrossOrigin(origins="*",maxAge=3600)
	@PostMapping(value="/GetPartInformationByCondition")
	public Map<String, Object> getPartInformationByCondition
            (@RequestBody VMPartInformationOfFinishGoodBoxInput
                     vmPartInformationOfFinishGoodBoxInput) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		Map<String, Object> map = new HashMap<String, Object>();
		List<VMFinishGoodBoxPartInformationRow> vmFinishGoodBoxPartInformationRowList = new ArrayList<>();
		try{
			if (vmPartInformationOfFinishGoodBoxInput.getPageIndex()==null) {
				vmPartInformationOfFinishGoodBoxInput.setPageIndex(1);
			}else{			
				List<PackingInformation> packingInformationList = packingInformationService.getPackingInformationList(vmPartInformationOfFinishGoodBoxInput);
				for (PackingInformation packingInformation : packingInformationList) {		
			
					VMFinishGoodBoxPartInformationRow vmFinishGoodBoxPartInformationRow = new VMFinishGoodBoxPartInformationRow();

					vmFinishGoodBoxPartInformationRow.setDeliveryOperatorCode(null);
					vmFinishGoodBoxPartInformationRow.setDeliveryOperatorName(null);
					vmFinishGoodBoxPartInformationRow.setFinishGoodBoxNumber(packingInformation.getContainer().getContainerNumber());
					vmFinishGoodBoxPartInformationRow.setFinishGoodSerialNumber(packingInformation.getPartSerialNumber().getSerialNumber());
					vmFinishGoodBoxPartInformationRow.setOperatorCode(packingInformation.getUser().getUserCode());
					vmFinishGoodBoxPartInformationRow.setOperatorName(packingInformation.getUser().getUserName());
					vmFinishGoodBoxPartInformationRow.setPackingDateTime(packingInformation.getPackingDateTime());
					if(packingInformation.getPartSerialNumber().getWorkOrder()!=null){
						vmFinishGoodBoxPartInformationRow.setCustomerMaterialPartNumber(packingInformation.getPartSerialNumber().getWorkOrder().getBomHead().getMaterial().getCustomerMaterialNumber());
						vmFinishGoodBoxPartInformationRow.setPartPartNumber(packingInformation.getPartSerialNumber().getWorkOrder().getBomHead().getMaterial().getMaterialNumber());
						vmFinishGoodBoxPartInformationRow.setDescription(packingInformation.getPartSerialNumber().getWorkOrder().getBomHead().getMaterial().getDescription());
					}
					
					vmFinishGoodBoxPartInformationRow.setPartSerialNumber(packingInformation.getPartSerialNumber().getSerialNumber());
					vmFinishGoodBoxPartInformationRow.setPartState(packingInformation.getPartSerialNumber().getState()== 1 ? "正常" : "异常");
					getPartMaterialRecordByPartSerialNumberService.init();
					vmFinishGoodBoxPartInformationRow.setMaterialRecords(getPartMaterialRecordByPartSerialNumberService.getPartMaterialRecordById(packingInformation.getPartSerialNumber().getSerialNumber()));
					vmFinishGoodBoxPartInformationRowList.add(vmFinishGoodBoxPartInformationRow);
				}
				Integer rowCount = packingInformationService.getRowCountOfPackingInformationList(vmPartInformationOfFinishGoodBoxInput);
				map.put("Tdto", vmFinishGoodBoxPartInformationRowList);
				map.put("RowCount", rowCount);
				json = this.setJson(200, "查询成功！", map);
			}		
		}catch(Exception e){
			json = this.setJson(200, "查询失败："+e.getMessage(), -1);
			logger.error(e);
		}
		return json;
	}
}
