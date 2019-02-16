package com.itheima.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义类型转换器，把String-----》Timestamp
 */
@Component
public class StringToDateConvert implements Converter<String,Timestamp>{
    @Override
    public Timestamp convert(String source) {
        try {
            // 转换String-->Date
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(source);
            // 创建Timestamp
            Timestamp timestamp = new Timestamp(date.getTime());
            return timestamp;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
