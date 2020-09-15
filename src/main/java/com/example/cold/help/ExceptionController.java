package com.example.cold.help;

import org.apache.shiro.authc.AccountException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理类
 */
@RestControllerAdvice
public class ExceptionController {

    /**
     * 捕捉抛出的异常 Exception
     */
    @ExceptionHandler(Exception.class)
    public BaseResponse handleShiroException(Exception ex) {
        BaseResponse baseResponse=new BaseResponse(BaseResponseEnums.FILE.getCode(),ex.getMessage());
        return baseResponse;
    }
}