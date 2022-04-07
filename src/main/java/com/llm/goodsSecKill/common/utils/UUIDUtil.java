package com.llm.goodsSecKill.common.utils;

import java.util.UUID;

/**
 * @description: UUID工具类
 * @author: LiuLuMing
 * @createtime: 2022-04-06 16:42
 */
public class UUIDUtil {

    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
