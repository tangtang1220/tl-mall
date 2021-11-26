package com.tangtang.portal.web.advice;

import com.tangtang.common.base.result.Result;
import com.tangtang.common.base.result.ResultWrapper;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result customException() {
        return ResultWrapper.result(301, "统一异常");
    }
}
