package com.smartflow.dao;

import com.smartflow.model.*;
import com.smartflow.util.MaterialRecordOutput;
import com.smartflow.util.VMPartMaterialRecordRow;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
/**
 * @author haita
 */
@Repository
public class GetPartMaterialRecordByPartSerialNumberDaoImpl implements GetPartMaterialRecordByPartSerialNumberDao{
	@Autowired
	HibernateTemplate hibernate;
	private List<VMPartMaterialRecordRow> vmPartMaterialRecordRows=new ArrayList<>();
	private StringBuilder i=new StringBuilder();
	@Override
	public MaterialRecordOutput getPartMaterialRecordById(String serialNumber) {
		// TODO Auto-generated method stub
		//根据序列号找出物料用料记录
	
		
		//创建物料记录容器
		MaterialRecordOutput materialRecordOutput=new MaterialRecordOutput();
        
		//根据序列号获取物料信息
		Session session=hibernate.getSessionFactory().openSession();
		try {
			String hql2 = "FROM PartSerialNumber WHERE serialNumber=:SerialNumber";
			Query query2 = session.createQuery(hql2);
			query2.setString("SerialNumber", serialNumber);
			@SuppressWarnings("unchecked")
			List<PartSerialNumber> partSerialNumbers = query2.list();


		if (partSerialNumbers.size()==0) {
			return null;
		}

		//求出序列号信息
		PartSerialNumber partSerialNumber=partSerialNumbers.get(0);
		//根据序列号各个字段的信息查找相应的信息
		Material material=partSerialNumber.getWorkOrder().getBomHead().getMaterial();
		materialRecordOutput.setCustomerPartNumber(material.getCustomerMaterialNumber());
		materialRecordOutput.setPartDescription(material.getDescription());
		materialRecordOutput.setPartDrawingNumber(material.getCADDrawingPartNumber());
		materialRecordOutput.setPartPartNumber(material.getMaterialNumber());
		WorkOrder workOrder=partSerialNumber.getWorkOrder();
		materialRecordOutput.setWorkOrderPlannedQuantity(workOrder.getPlannedQuantity());
		materialRecordOutput.setWorkOrderNumber(workOrder.getWorkOrderNumber());
		materialRecordOutput.setPartState(partSerialNumber.getState() == 1 ? "正常":"锁定");
		if (!partSerialNumber.getPackingInformations().isEmpty()) {
			materialRecordOutput.setContainerNumber
					(partSerialNumber.getPackingInformations().iterator().next().getContainer().getContainerNumber());
		}


		String hql="FROM PartMaterialRecord WHERE PartSerialNumberId=:PartSerialNumberId";
		Query query=session.createQuery(hql);
		query.setParameter("PartSerialNumberId", partSerialNumber.getId());
		@SuppressWarnings("unchecked")
		List<PartMaterialRecord> partMaterialRecords=query.list();
		//将找到的物料信息装到物料信息容器中
		for (PartMaterialRecord partMaterialRecord : partMaterialRecords) {
			Container container=partMaterialRecord.getContainer();
			Material materialForContainer=container.getMaterial();
			Material materiaForWorkOrder=partSerialNumber.getWorkOrder().getBomHead().getMaterial();
			vmPartMaterialRecordRows.add(new VMPartMaterialRecordRow(partMaterialRecord.getDesignator(), 
					materialForContainer.getMaterialNumber(), 
					materialForContainer.getSupplierMaterialNumber(),
					materialForContainer.getDescription() ,
					materialForContainer.getSpecification(),
					container.getBatchNumber(),
					container.getContainerNumber(), 
					partMaterialRecord.getMaterialSetupStation().getStationNumber(), 
					partMaterialRecord.getMaterialSetupStation().getName(),
					partSerialNumber.getWorkOrder().getWorkOrderNumber(),
					materiaForWorkOrder.getMaterialNumber(), 
					partMaterialRecord.getMaterialSetupDateTime(),
					partMaterialRecord.getMaterialSetupOperator().getUserCode(),
					partMaterialRecord.getMaterialSetupOperator().getUserName(),
					container.getSupplier().getCode(),partMaterialRecord.getConsumedQuantity(),
					"1"));
			getPartMaterialRecordByContainerId(container.getId());
		}

		materialRecordOutput.setPartMaterialRecordRowData(vmPartMaterialRecordRows);
		
		return materialRecordOutput;
		}
		finally {
			session.close();
		}
	}

	/**
	 * 初始化数据格式
	 */
	@Override
public void init() {
	// TODO Auto-generated method stub
		vmPartMaterialRecordRows=new ArrayList<>();
	  i=new StringBuilder("●");
}

	/**
	 * 根据容器号深度优先遍历物料记录，并将记录插入到物料记录数组中
	 * @param id 容器号Id
	 */
	@Override
public void getPartMaterialRecordByContainerId(int id) {
	// TODO Auto-generated method stub
	Container container=hibernate.get(Container.class, id);
	@SuppressWarnings("unchecked")
	List<PartSerialNumber> partSerialNumbers=
			(List<PartSerialNumber>)
					hibernate.findByNamedParam
							("FROM PartSerialNumber WHERE serialNumber=:SerialNumber",
									"SerialNumber", container.getContainerNumber());
	if (partSerialNumbers.size()==0) {
		return ;
	}
	PartSerialNumber partSerialNumber=partSerialNumbers.get(0);
	@SuppressWarnings("unchecked")
	List<PartMaterialRecord> partMaterialRecords=
			(List<PartMaterialRecord>)
					hibernate.findByNamedParam
							("FROM PartMaterialRecord WHERE PartSerialNumberId=:PartSerialNumberId",
									"PartSerialNumberId",
									partSerialNumber.getId());
	if (partMaterialRecords.size()==0) {
	}
	else
	{
		addVmPartMaterialRecordRows
				(partMaterialRecords,container,partSerialNumber);
	}
	}

	/**
	 * 用于填充给前端展示的物料记录数组,递归循环第二层调用
	 * @param partMaterialRecords 用于填充的物料记录数组
	 * @param container 容器实体
	 * @param partSerialNumber 序列号
	 */
	private void addVmPartMaterialRecordRows(List<PartMaterialRecord>  partMaterialRecords,
											 Container container,
											 PartSerialNumber partSerialNumber)
	{
		for (PartMaterialRecord partMaterialRecord : partMaterialRecords) {
			PartSerialNumber partSerialNumber02= partMaterialRecord.getPartSerialNumber();
			Container container02=partMaterialRecord.getContainer();
			Material materialForContainer=container02.getMaterial();
			Material materiaForWorkOrder=partSerialNumber02.getWorkOrder().getBomHead().getMaterial();
			vmPartMaterialRecordRows.add(
					new VMPartMaterialRecordRow(i+partMaterialRecord.getDesignator(),
							materialForContainer.getMaterialNumber(),
							materialForContainer.getSupplierMaterialNumber(),
							materialForContainer.getDescription(),
							materialForContainer.getSpecification(),
							container02.getBatchNumber(),
							container02.getContainerNumber(),
							partMaterialRecord.getMaterialSetupStation().getStationNumber(),
							partMaterialRecord.getMaterialSetupStation().getName(),
							partSerialNumber.getWorkOrder().getWorkOrderNumber(),
							materiaForWorkOrder.getMaterialNumber(),
							partMaterialRecord.getMaterialSetupDateTime(),
							partMaterialRecord.getMaterialSetupOperator().getUserCode(),
							partMaterialRecord.getMaterialSetupOperator().getUserName(),
							container.getSupplier().getCode(),partMaterialRecord.getConsumedQuantity(),
							i+Integer.toString(i.length()+1)));
			i=i.append("●");
			getPartMaterialRecordByContainerId(container02.getId());
			i.substring(0, i.length()-1);

		}
	}
}
