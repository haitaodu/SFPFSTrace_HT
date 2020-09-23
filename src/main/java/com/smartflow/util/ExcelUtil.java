package com.smartflow.util;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.ComparisonOperator;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.util.CollectionUtils;
import com.spire.xls.*;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class ExcelUtil {
    /**
     * 导出Excel
     * @param dataList
     * @param filePath
     * @param fileName
     * @return
     */
    public static String exportExcel(List<Map<String,Object>> dataList,  String[] headers, String filePath, String fileName){
        try{
            // TODO 创建HSSFWorkbook对象(excel的文档对象)
            HSSFWorkbook wb = new HSSFWorkbook();
            // TODO 设置字体格式大小
            HSSFFont font = wb.createFont();
            font.setFontName("宋体");
            font.setFontHeightInPoints((short) 14);//设置字体大小
            HSSFCellStyle cellStyle = wb.createCellStyle();
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 居中cellStyle.setAlignment(HorizontalAlignment.CENTER);
            cellStyle.setFont(font);

            //建立新的sheet对象（excel的表单）
            HSSFSheet sheet = wb.createSheet("工站相关信息");
            //在sheet里创建第一行，参数为行索引(excel的行)，可以是0～65535之间的任何一个
            HSSFRow row1 = sheet.createRow(0);
            row1.setHeight((short)400);
            //创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
//			HSSFCell cell = row1.createCell(0);

            //设置单元格内容
//			cell.setCellStyle(cellStyle);
//			cell.setCellValue("采购单");
            //合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列
//			sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, purchaseList.size()-1));

            //在sheet里创建第二行
//			HSSFRow row2 = sheet.createRow(1);
//			row2.setHeight((short) 500);

            List<String> headerList = Arrays.asList(headers);

//			Iterator<Map<String, Object>> it = dataList.iterator();
//			Object[] headerList = null;
//			List<String> valueList = new ArrayList<>();
//			while (it.hasNext()) {
//				Map<String,Object> map = it.next();
//				headerList = map.keySet().toArray();
//				for (Object key : headerList) {
//					String value = map.get(key).toString();
//					valueList.add(value);
//				}
//			}
            //获取列数
//			int columnCount = headerList.size();
            //创建单元格并设置单元格内容
            for (int i = 0; i < headerList.size(); i++) {
                sheet.setColumnWidth(i,40*256);
                HSSFCell cell1 = row1.createCell(i);
                cell1.setCellStyle(cellStyle);
                cell1.setCellValue(headerList.get(i));
            }
            int b = 1;
            //数据导入单元格
            if(!CollectionUtils.isEmpty(dataList)) {
                Iterator<Map<String, Object>> it = dataList.iterator();
                int index = 0;
                while(it.hasNext()){
                    index ++;

                    HSSFRow row = sheet.createRow(index);
                    Map<String,Object> map = it.next();
                    Set<String> mapKey = (Set<String>) map.keySet();
                    Iterator<String> iterator = mapKey.iterator();
                    row.setRowStyle(cellStyle);
                    row.setHeight((short) 400);
                    int num = 0;
                    while(iterator.hasNext()){
                        HSSFCell cell = row.createCell(num);
                        cell.setCellStyle(cellStyle);
                        num ++;
                        String key = iterator.next();
                        Object obj = map.get(key);
                        if(obj instanceof Date){
                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            cell.setCellValue(sdf.format(obj));
                        }else if(obj instanceof Integer){
                            cell.setCellValue((Integer) obj);
                        }else if(obj instanceof Double){
                            cell.setCellValue((Double) obj);
                        }else{
                            cell.setCellValue((String) obj);
                        }
                    }
                }
            }
            //输出Excel文件
            //File file = new File(filePath+"\\"+fileName+".xls");
            File file = new File(filePath + File.separator + fileName);
            if(!file.exists()){
                //文件不存在时，先创建文件的父级目录
                file.getParentFile().mkdir();
                file.createNewFile();
            }

            //File excelFile = File.createTempFile(fileName, ".xls", file);
            FileOutputStream os = new FileOutputStream(file);
            wb.write(os);
            os.close();
            setConditionStyle(file);
//			System.out.println(filePath+"文件成功导出"+fileName+"=========="+file.getName());
            return fileName;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }


    public static void setConditionStyle(File file){
        //创建Workbook对象
        Workbook workbook = new Workbook();
        //加载文档
        workbook.loadFromFile(file.getPath());
        //获取第一个工作表
        Worksheet worksheet = workbook.getWorksheets().get(0);
        //使用条件格式找出B3:E6区域中低于平均值得单元格，并设置红色背景
        ConditionalFormatWrapper format1 = worksheet.getCellRange("AU1:AU20").getConditionalFormats().addCondition();
        format1.setOperator(ComparisonOperatorType.Between);
        format1.setFirstFormula("30");
        format1.setSecondFormula("40");
        format1.setBackColor(Color.red);
        workbook.saveToFile(file.getPath(), ExcelVersion.Version2016);
        workbook.dispose();
    }
}
