package com.tangtang.common.base.enums;

public enum StateCodeEnum {

    SUCCESS(200, "请求成功");

    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    StateCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
