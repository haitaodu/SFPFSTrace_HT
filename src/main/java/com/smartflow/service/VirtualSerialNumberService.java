package com.smartflow.service;

import com.smartflow.model.VirtualSerialNumber;

public interface VirtualSerialNumberService {
    /**
     * 添加虚拟商品条码
     * @param virtualSerialNumber
     */
    public void addVirtualSerialNumber(VirtualSerialNumber virtualSerialNumber);

    /**
     * 将虚拟条码替换成真实条码
     * @param virtualSerialNumber
     */
    public void updateVirtualSerialNumber(VirtualSerialNumber virtualSerialNumber);

    /**
     * 根据id查询条码信息
     * @param workOrderId
     * @return
     */
    public VirtualSerialNumber getVirtualSerialNumberByWorkOrderId(Integer workOrderId);

    /**
     * 根据id查询条码号
     * @param Id
     * @return
     */
    public String getSerialNumberById(Integer Id);

    /**
     *
     * @param lastStationName
     * @return
     */
    /**
     * 根据上一站的名称以及当前已激活的工单找到上一站的条码
     * @param lastStationName
     * @param workOrderId
     * @return
     */
    public String getLastStationSerialNumber(String lastStationName, Integer workOrderId);
}
