package com.smartflow.dto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @Author: WJJ
 * @Description:
 * @Date: 2021-01-08 15:37
 **/
public class StationTestResultHeaderDTO {
    private String title;
    private List<Map<String,Object>> children;

    public StationTestResultHeaderDTO(String title, List<Map<String, Object>> children) {
        this.title = title;
        this.children = children;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Map<String, Object>> getChildren() {
        return children;
    }

    public void setChildren(List<Map<String, Object>> children) {
        this.children = children;
    }
}
