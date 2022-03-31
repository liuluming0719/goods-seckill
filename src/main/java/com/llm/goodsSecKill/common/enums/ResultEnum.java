package com.llm.goodsSecKill.common.enums;

import lombok.Getter;

/**
 * @description: 返回状态枚举类
 * @author: LiuLuMing
 * @createtime: 2022-03-31 17:38
 */
@Getter
public enum ResultEnum {

    //通用响应码
    SUCCESS(200,"操作成功"),
    ERROR(500,"服务端异常")
    ;

    private final Integer code;
    private final String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
