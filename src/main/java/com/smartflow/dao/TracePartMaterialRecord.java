package com.smartflow.dao;

import java.util.List;

import com.smartflow.util.MaterialContainer;

public interface TracePartMaterialRecord {
//模糊查询物料追溯信息
	public List<MaterialContainer>getDataForMaterialRecord(String containerNumber,String materialPartNumber,String supplierCode,String batchNumber,String supplierMaterialPartNumber,int pageIndex,int pageSize );
//根据前端数据找到分页条目数
	public int getCountData(String containerNumber,String materialPartNumber,String supplierCode,String batchNumber,String supplierMaterialPartNumber,int pageIndex,int pageSize);
}
