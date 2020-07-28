package com.smartflow.dto;

import java.util.List;
import java.util.Map;

public class VMTracePartByStationOutput {
	private List<TableHeaderDTO> HeaderList;
	private List<Map<String,Object>> DataList;
	private Integer Total;

	public VMTracePartByStationOutput() {
	}

	public List<TableHeaderDTO> getHeaderList() {
		return HeaderList;
	}

	public void setHeaderList(List<TableHeaderDTO> headerList) {
		HeaderList = headerList;
	}

	public List<Map<String, Object>> getDataList() {
		return DataList;
	}

	public void setDataList(List<Map<String, Object>> dataList) {
		DataList = dataList;
	}

	public Integer getTotal() {
		return Total;
	}

	public void setTotal(Integer total) {
		Total = total;
	}
}
