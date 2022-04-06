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
    SUCCESS(200, "操作成功"),
    ERROR(500, "服务端异常"),

    //登录模块
    LOGIN_PASSWORD_ERROR(500209, "密码不正确"),
    LOGIN_USER_ERROR(500210, "用户名不正确"),
    MOBILE_ERROR(500211, "手机号码格式不正确"),
    BIND_ERROR(500212, "参数校验异常"),
    MOBILE_NOT_EXIST(500213, "手机号码不存在");

    private final Integer code;
    private final String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
