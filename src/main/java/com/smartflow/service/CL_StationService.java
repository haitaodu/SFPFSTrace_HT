package com.smartflow.service;

import com.smartflow.dto.*;

import java.util.List;
import java.util.Map;

/**
 * @author haita
 */
public interface CL_StationService {
    /**
     * 根据工站id查询关联的表名
     * @param stationId 工作id
     * @return 关联表名
     */
    public String getLinkTableNameByStationId(Integer stationId);

    /**
     * 根据关联的表名查询工站设备相关信息
     * @param linkTableName
     * @return
     */
    public List<Map<String,Object>> getCLStationDeviceListByLinkTableName
    (String linkTableName,
     VMTracePartByStationInput vmTracePartByStationInput);

    /**
     * 根据关联的表名查询工站设备相关信息总条数
     * @param linkTableName
     * @param vmTracePartByStationInput
     * @return
     */
    public Integer getTotalCountCLStationDeviceListByLinkTableName(String linkTableName, VMTracePartByStationInput vmTracePartByStationInput);

    /**
     * 根据工站、序列号（工单）、开始时间、结束时间查询设备相关信息总条
     * @param linkTableName
     * @param vmTracePartBySerialNumberOrWorkOrderInput
     * @param flag equals/like
     * @return
     */
    public Integer getTotalCountCLStationDeviceListByCondition(String linkTableName, VMTracePartBySerialNumberOrWorkOrderInput vmTracePartBySerialNumberOrWorkOrderInput, String flag);

    /**
     * 根据工站、序列号（工单）、开始时间、结束时间查询设备相关信息数
     * @param linkTableName
     * @param vmTracePartBySerialNumberOrWorkOrderInput
     * @param flag equals/like
     * @return
     */
    public List<Map<String,Object>> getCLStationDeviceListByCondition(String linkTableName, VMTracePartBySerialNumberOrWorkOrderInput vmTracePartBySerialNumberOrWorkOrderInput, String flag);


    /**
     * 添加工站设备生产信息
     * @param entityName
     * @param object
     */
    public void addCLStationDevice(String entityName,Object object);

    /**
     *
     * @param linkTableName 表名
     * @return 根据数据库表名返回表头
     */
    public List<TableHeaderDTO> getHeaderListByLinkTableName(String linkTableName);
    /**
     * 查询当前已激活的工单
     * @return
     */
    public Integer getCurrentActivedWorkOrder();

    /**
     * 根据工单id查询工单号
     * @param workOrderId 工单id
     * @return 根据工单Id返回工单号
     */
    public String getWorkOrderNumberByWorkOrderId(Integer workOrderId);




    public void reWriteSerialNumber(String serialNumber,
                                    String tableName,
                                    List<String> stationList
            ,String printStation,long workOrderId);

    /**
     *
     * @param state 状态
     * @param serialNumber 条形码
     * @param tableName 表名
     */
    public void setSerialNumber(String serialNumber,String tableName,int state,long workOrderId)
            throws ClassNotFoundException;



    /**
     * 根据关联的表名查询工站设备相关信息
     * @param linkTableName
     * @return
     */
    public List<Map<String,Object>> getCLStationDeviceListByLinkTableName
    (String linkTableName);


    /**
     * 根据linkName获取打印机以前的数据
     * @param linkName 给出的linkName
     * @param workOrder 工单Id方便找出相应的工艺->工站
     * @return 列表
     */
    public List<String> getStaionListByLinkName(String linkName,int workOrder);


    String getSerialNumber(String tableName,long workOrderId);

    /**
     * 根据UUID修改状态（将状态一键置1或者0）
     * @param updateStateByUUIDListInputDTO
     */
    public void updateStateByUUIDList(UpdateStateByUUIDListInputDTO updateStateByUUIDListInputDTO);

    /**
     * 根据工站id和开始时间、结束时间查询工件数量
     * @param linkTableName
     * @param getCompletedQuantityInputDTO
     * @return
     */
    public Integer getTotalCountCLStationListByCondition(String linkTableName, GetCompletedQuantityInputDTO getCompletedQuantityInputDTO);
}
