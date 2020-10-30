package com.smartflow.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class BigDecimalSerialize extends JsonSerializer<Object> {

//    private DecimalFormat df = new DecimalFormat("##.####");

    //修改要除的数据
    private static final BigDecimal TEMP = BigDecimal.valueOf(1000000L);

//    @Override
//    public void serialize(BigDecimal value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
//        if (!StringUtils.isEmpty(value)){
//            df.setMaximumFractionDigits(4);//显示几位数
//            df.setGroupingSize(0);
//            df.setRoundingMode(RoundingMode.FLOOR);
//            //根据实际情况选择使用
//            // gen.writeString(df.format(value));  // 返回出去是字符串
//            jsonGenerator.writeNumber(df.format(value));  // 返回出去是数字形式
//        }
//    }


    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value != null) {
            BigDecimal bigDecimal = new BigDecimal(value.toString());
            //参考该方法 第二个参数是几就保留几位小数 第三个参数 参考 RoundingMode.java
            gen.writeNumber(bigDecimal.divide(TEMP, 4, RoundingMode.DOWN));
        }
    }

}
