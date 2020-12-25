package com.smartflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * @Author: WJJ
 * @Description:
 * @Date: 2020-12-25 10:03
 **/
public class GetCompletedQuantityInputDTO {
    private List<Integer> StationIdList;
    private Long WorkOrderId;
    private String StartDateTime;
    private String EndDateTime;
    @JsonProperty("StationIdList")
    public List<Integer> getStationIdList() {
        return StationIdList;
    }

    public void setStationIdList(List<Integer> stationIdList) {
        StationIdList = stationIdList;
    }
    @JsonProperty("WorkOrderId")
    public Long getWorkOrderId() {
        return WorkOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        WorkOrderId = workOrderId;
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

}
