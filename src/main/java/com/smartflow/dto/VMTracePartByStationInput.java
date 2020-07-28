package com.smartflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VMTracePartByStationInput {
	private Integer StationId;
	private String StartDateTime;
	private String EndDateTime;
	private Boolean IsOnlyShowFinalResult;
	private Integer PageIndex;
	private Integer PageSize;
	@JsonProperty("StationId")
	public Integer getStationId() {
		return StationId;
	}
	public void setStationId(Integer stationId) {
		StationId = stationId;
	}
	@JsonProperty("StartDateTime")
	public String getStartDateTime() {
		return StartDateTime;
	}
	public void setStartDateTime(String startDateTime) {
		StartDateTime = startDateTime;
	}
	@JsonProperty("EndDateTime")
	public String getEndDateTime() {
		return EndDateTime;
	}
	public void setEndDateTime(String endDateTime) {
		EndDateTime = endDateTime;
	}
	@JsonProperty("IsOnlyShowFinalResult")
	public Boolean getIsOnlyShowFinalResult() {
		return IsOnlyShowFinalResult;
	}
	public void setIsOnlyShowFinalResult(Boolean isOnlyShowFinalResult) {
		IsOnlyShowFinalResult = isOnlyShowFinalResult;
	}
	@JsonProperty("PageIndex")
	public Integer getPageIndex() {
		return PageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		PageIndex = pageIndex;
	}
	@JsonProperty("PageSize")
	public Integer getPageSize() {
		return PageSize;
	}
	public void setPageSize(Integer pageSize) {
		PageSize = pageSize;
	}

}
