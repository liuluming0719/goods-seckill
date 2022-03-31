package com.llm.goodsSecKill.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 返回结果集
 * @author: LiuLuMing
 * @createtime: 2022-03-31 16:02
 */
@Data
public class ResultVo implements Serializable {

    private int code;
    private String msg;
    private Object data;

    public static ResultVo success(Object data) {
        return success(200, "操作成功", data);
    }

    public static ResultVo success(int code, String msg, Object data) {
        ResultVo r = new ResultVo();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static ResultVo error(String msg) {
        return error(400, msg, null);
    }

    public static ResultVo error(String msg, Object data) {
        return error(400, msg, data);
    }

    public static ResultVo error(int code, String msg, Object data) {
        ResultVo r = new ResultVo();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}


