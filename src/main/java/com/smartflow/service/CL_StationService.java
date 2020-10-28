package com.smartflow.service;

import com.smartflow.dto.TableHeaderDTO;
import com.smartflow.dto.VMTracePartBySerialNumberOrWorkOrderInput;
import com.smartflow.dto.VMTracePartByStationInput;

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
     * @return
     */
    public Integer getTotalCountCLStationDeviceListByCondition(String linkTableName, VMTracePartBySerialNumberOrWorkOrderInput vmTracePartBySerialNumberOrWorkOrderInput);

    /**
     * 根据工站、序列号（工单）、开始时间、结束时间查询设备相关信息数
     * @param linkTableName
     * @param vmTracePartBySerialNumberOrWorkOrderInput
     * @return
     */
    public List<Map<String,Object>> getCLStationDeviceListByCondition(String linkTableName, VMTracePartBySerialNumberOrWorkOrderInput vmTracePartBySerialNumberOrWorkOrderInput);


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




    public void reWriteSerialNumber(String serialNumber, String tableName);

    /**
     *
     * @param serialNumber 条形码
     * @param tableName 表名
     */
    public void setSerialNumber(String serialNumber,String tableName)
            throws ClassNotFoundException;

    /**
     *
     * @param serialNumber 条形码
     * @param tableName 表名
     */
    public void writeNg(String serialNumber,String tableName);

    /**
     * 根据关联的表名查询工站设备相关信息
     * @param linkTableName
     * @return
     */
    public List<Map<String,Object>> getCLStationDeviceListByLinkTableName(String linkTableName);
}
