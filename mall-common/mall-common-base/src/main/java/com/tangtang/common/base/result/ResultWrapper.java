package com.tangtang.common.base.result;

import com.tangtang.common.base.enums.StateCodeEnum;

public class ResultWrapper {

    public static Result success(StateCodeEnum stateCodeEnum) {
        return result(stateCodeEnum.getCode(), stateCodeEnum.getMsg());
    }

    public static Result failed(String msg) {
        return result(-1, msg, null);
    }

    public static <T> Result<T> result(int code, String msg) {
        return result(code, msg, null);
    }

    private static <T> Result<T> result(int code, String msg, T data) {
        return Result.<T>builder().code(code).msg(msg).data(data).build();
    }
}
