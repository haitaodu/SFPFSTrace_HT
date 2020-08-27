package com.smartflow.service;

import java.util.List;
import java.util.Map;
public interface WorkOrderService {
    /**
     * 查询工站下拉列表(保留状态是0:Planned/New和10:Started(工单激活就变成开始生产了))
     * @return
     */
    public List<Map<String, Object>> getWorkOrderInit();
}
