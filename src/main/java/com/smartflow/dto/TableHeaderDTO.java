package com.smartflow.dto;

import com.smartflow.common.stationenum.FilterModeEnum;
import com.smartflow.predicate.ObjectPropertyPredicate;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableHeaderDTO that = (TableHeaderDTO) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(dataIndex, that.dataIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, dataIndex);
    }

    /**
     * 通过批量过滤条件 过滤指定对象属性的值(去掉)
     * @param headerList
     * @return
     */
    public static List<TableHeaderDTO> filterHeaders(List<TableHeaderDTO> headerList, List<String> filters, ObjectPropertyPredicate<TableHeaderDTO> headerDTO, FilterModeEnum filterMode){
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
            Predicate<TableHeaderDTO> headerdtoOr= h -> true;
            for (String filter : filters){
                Predicate<TableHeaderDTO> headerDTOPredicate = (h) -> !(headerDTO.getProperty(h).toString().startsWith(filter));
                headerdtoOr = headerdtoOr.and(headerDTOPredicate);
            }
            result = headerList.stream().filter(headerdtoOr).collect(Collectors.toList());
        }else if(filterMode == FilterModeEnum.contains){
            result = headerList.stream().filter(h -> !filters.contains(headerDTO.getProperty(h).toString())).collect(Collectors.toList());
        }else if(filterMode == FilterModeEnum.equals){
            Predicate<TableHeaderDTO> headerdtoOr = h -> true;
            for (String filter : filters){
                Predicate<TableHeaderDTO> headerDTOPredicate = (h) -> !headerDTO.getProperty(h).toString().equals(filter);
                headerdtoOr = headerdtoOr.and(headerDTOPredicate);
            }
            result = headerList.stream().filter(headerdtoOr).collect(Collectors.toList());
        }
        return result;
    }

    /**
     * 通过批量过滤条件（codes） 过滤指定对象属性的值（保留）
     * @param dataSource 数据源集合
     * @param codes 过滤条件集合
     * @param express 过滤集合对象目标属性表达式
     * @param filterMode 过滤方式
     * @return 返回符合过滤条件codes的对象集合
     */
    public static List<TableHeaderDTO> queryArray(List<TableHeaderDTO> dataSource, List<String> codes, ObjectPropertyPredicate<TableHeaderDTO> express, FilterModeEnum filterMode) {
        List<TableHeaderDTO> result = new ArrayList<>();
        if (dataSource == null) {
            return result;
        }
        if (codes == null || (long) codes.size() == 0) {
            return dataSource;
        }
        if (express == null) {
            return dataSource;
        }
        if (filterMode == FilterModeEnum.startsWith) {
            Predicate<TableHeaderDTO> expressOr = f -> false;
            for (String code : codes) {
                Predicate<TableHeaderDTO> press = (w) -> !express.getProperty(w).toString().startsWith(code);
                expressOr = expressOr.or(press);
            }
            result = dataSource.stream().filter(expressOr).collect(Collectors.toList());
        } else if (filterMode == FilterModeEnum.contains) {
            result = dataSource.stream().filter(f -> !codes.contains(express.getProperty(f).toString())).collect(Collectors.toList());
        } else if (filterMode == FilterModeEnum.equals) {
            Predicate<TableHeaderDTO> expressOr = f -> false;
            for (String code : codes) {
                Predicate<TableHeaderDTO> press = (w) -> !express.getProperty(w).toString().equals(code);
                expressOr = expressOr.or(press);
            }
            result = dataSource.stream().filter(expressOr).collect(Collectors.toList());
        }
        return result;
    }
}
