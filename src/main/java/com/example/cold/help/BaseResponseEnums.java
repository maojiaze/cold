package com.example.cold.help;


public enum BaseResponseEnums {
    FILE(0,"失败"),
    SUCCESS(1,"成功");

    private Integer code;
    private String msg;

    BaseResponseEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
