package com.llm.goodsSecKill.common.vo;

import com.llm.goodsSecKill.common.enums.ResultEnum;
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

    public static ResultVo success() {
        return success(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMsg(), null);
    }
    public static ResultVo success(Object data) {
        return success(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMsg(), data);
    }

    public static ResultVo success(int code, String msg, Object data) {
        ResultVo r = new ResultVo();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static ResultVo error(String msg) {
        return error(ResultEnum.ERROR.getCode(), msg, null);
    }

    public static ResultVo error(String msg, Object data) {
        return error(ResultEnum.ERROR.getCode(), msg, data);
    }

    public static ResultVo error(ResultEnum resultEnum) {
        return error(resultEnum.getCode(), resultEnum.getMsg(), null);
    }

    public static ResultVo error(int code, String msg, Object data) {
        ResultVo r = new ResultVo();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}


