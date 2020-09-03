package com.smartflow.dto;

import com.smartflow.common.stationenum.FilterModeEnum;
import org.apache.poi.util.StringUtil;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TableHeaderDTO {
    private String title;
    private String dataIndex;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDataIndex() {
        return dataIndex;
    }

    public void setDataIndex(String dataIndex) {
        this.dataIndex = dataIndex;
    }
    public TableHeaderDTO() {

    }

    public TableHeaderDTO(String title, String dataIndex) {
        this.title = title;
        this.dataIndex = dataIndex;
    }

    @Override
    public String toString() {
        return "TableHeaderDTO{" +
                "title='" + title + '\'' +
                ", dataIndex='" + dataIndex + '\'' +
                '}';
    }


    /**
     * 通过批量过滤条件 过滤指定对象属性的值
     * @param headerList
     * @return
     */
    public static List<TableHeaderDTO> filterHeaders(List<TableHeaderDTO> headerList, List<String> filters, FilterModeEnum filterMode){
        List<TableHeaderDTO> result = new ArrayList<>();
        if(headerList == null){
            return result;
        }
        if(CollectionUtils.isEmpty(filters)){
            return headerList;
        }
//        if(header == null){
//            return headerList;
//        }
        if(filterMode == FilterModeEnum.startsWith){
            Predicate<TableHeaderDTO> headerDTO = h -> false;
            for (String filter : filters){
                Predicate<TableHeaderDTO> headerDTOPredicate = (h) -> h.getDataIndex().startsWith(filter);
                headerDTO = headerDTO.or(headerDTOPredicate);
            }
            result = headerList.stream().filter(headerDTO).collect(Collectors.toList());
        }else if(filterMode == FilterModeEnum.contains){
            result = headerList.stream().filter(h -> filters.contains(h.getDataIndex())).collect(Collectors.toList());
        }else if(filterMode == FilterModeEnum.equals){
            Predicate<TableHeaderDTO> headerDTO = h -> false;
            for (String filter : filters){
                Predicate<TableHeaderDTO> headerDTOPredicate = (h) -> h.getDataIndex().equals(filter);
                headerDTO = headerDTO.or(headerDTOPredicate);
            }
            result = headerList.stream().filter(headerDTO).collect(Collectors.toList());
        }
        return result;
    }
}
