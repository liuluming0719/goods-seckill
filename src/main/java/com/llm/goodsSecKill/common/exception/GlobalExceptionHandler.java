package com.llm.goodsSecKill.common.exception;

import com.llm.goodsSecKill.common.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description: 全局异常处理类
 * @author: LiuLuMing
 * @createtime: 2022-04-01 11:37
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVo handler(MethodArgumentNotValidException e) {
        log.error("实体校验异常：--------------", e);
        BindingResult bindingResult = e.getBindingResult();
        ObjectError error = bindingResult.getAllErrors().stream().findFirst().get();
        return ResultVo.error(error.getDefaultMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(RuntimeException.class)
    public ResultVo handler(RuntimeException e) {
        log.error("运行时异常：============",e);
        return ResultVo.error(e.getMessage());
    }

}
