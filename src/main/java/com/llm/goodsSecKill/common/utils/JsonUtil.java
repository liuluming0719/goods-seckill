package com.llm.goodsSecKill.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

/**
 * @description: json工具类
 * @author: LiuLuMing
 * @createtime: 2022-04-07 15:08
 */
public class JsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 功能说明: 将对象转字符串
     *
     * @param obj 对象
     * @return java.lang.String
     * @author  LiuLuMing
     * @createtime  2022/4/7 15:11
     */
    public static String object2JsonStr(Object obj) {
        try {
            String value = objectMapper.writeValueAsString(obj);
            return value;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 功能说明: 字符串转对象
     *
     * @param str str
     * @param clazz clazz
     * @return T
     * @author  LiuLuMing
     * @createtime  2022/4/7 15:17
     */
    public static <T> T jsonStr2Obj(String str,Class<T> clazz) {
        try {
            return objectMapper.readValue(str.getBytes("utf-8"),clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 功能说明: 将json数据转换成pojo对象list
     *
     * @param jsonStr jsonStr
     * @param beanType beanType
     * @return java.util.List<T>
     * @author  LiuLuMing
     * @createtime  2022/4/7 15:21
     */
    public static <T> List<T> jsonToList(String jsonStr, Class<T> beanType) {
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, beanType);
        try {
            List<T> list = objectMapper.readValue(jsonStr, javaType);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
