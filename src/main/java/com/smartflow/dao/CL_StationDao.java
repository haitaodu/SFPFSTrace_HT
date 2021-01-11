package com.smartflow.dao;

import com.smartflow.dto.*;

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

    /**
     * 根据关联的表名查询工站设备相关信息
     * @param linkTableName
     * @return
     */
    public List<Map<String,Object>> getCLStationDeviceListByLinkTableName(String linkTableName);

    /**
     * 根据UUID修改状态（将状态一键置1或者0）
     * @param updateStateByUUIDListInputDTO
     * @param linkTableName
     */
    public void updateStateByUUIDList(UpdateStateByUUIDListInputDTO updateStateByUUIDListInputDTO, String linkTableName);

    /**
     * 根据工站id和开始时间、结束时间查询工件数量
     * @param linkTableName
     * @param getCompletedQuantityInputDTO
     * @return
     */
    public Integer getTotalCountCLStationListByCondition(String linkTableName, GetCompletedQuantityInputDTO getCompletedQuantityInputDTO);

    /**
     * 根据关联表和条码查询工站测试结果
     * @param serialNumber
     * @param linkTableNameList
     * @return
     */
    public List<Map<String,Object>> getStationTestResultBySerialNumberAndLinkTableName(String cellNumber, String serialNumber, List<StationLinkTableNameDTO> linkTableNameList, boolean isTCFlag);

    /**
     * 根据条码查询TCOP10是否有生产记录，有则搜索出其他几个条码
     * @param cellNumber
     * @param serialNumber
     * @return
     */
    public CellSerialNumberDTO getCellSerialNumberDTOFromTCOP10(String cellNumber, String serialNumber);

    /**
     * 根据TU条码查询PD条码/根据PD条码查询TU条码
     * @param cellNumber
     * @param cellSerialNumberDTO
     * @return
     */
    public CellSerialNumberDTO getTUOrPDSerialNumberFromCOMOP10(CellSerialNumberDTO cellSerialNumberDTO, String cellNumber);
}
