package com.smartflow.dao;

import com.smartflow.dto.TableHeaderDTO;
import com.smartflow.dto.VMTracePartByStationInput;

import java.util.List;
import java.util.Map;

public interface CL_StationDao {
    /**
     * 根据工站id查询关联的表名
     *
     * @param stationId 工作id
     * @return 关联表名
     */
    public String getLinkTableNameByStationId(Integer stationId);

    /**
     * 根据关联的表名查询工站设备相关信息
     * @param linkTableName
     * @return
     */
    public List<Map<String,Object>> getCLStationDeviceListByLinkTableName(String linkTableName, VMTracePartByStationInput vmTracePartByStationInput);

    /**
     * 根据关联的表名查询工站设备相关信息总条数
     * @param linkTableName
     * @param vmTracePartByStationInput
     * @return
     */
    public Integer getTotalCountCLStationDeviceListByLinkTableName(String linkTableName, VMTracePartByStationInput vmTracePartByStationInput);

    /**
     * 添加工站设备生产信息
     * @param entityName
     * @param entity
     */
    public void addCLStationDevice(String entityName, Object entity);

    /**
     *
     * @param linkTableName 表名
     * @return 根据数据库表名返回表头
     */
    public List<TableHeaderDTO> getHeaderListByLinkTableName(String linkTableName);

    /**
     * 查询当前已激活工单
     * @return
     */
    public Integer getCurrentActivedWorkOrder();

    /**
     * 根据工单id查询工单号
     * @param workOrderId
     * @return
     */
    public String getWorkOrderNumberByWorkOrderId(Integer workOrderId);

}
