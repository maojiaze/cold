package com.example.cold.help;

import lombok.Data;

@Data
public class BaseResponse<T> {
    private Integer code;
    private String msg;
    private T data;

    public BaseResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResponse(){
        this.code=BaseResponseEnums.SUCCESS.getCode();
    }
}
