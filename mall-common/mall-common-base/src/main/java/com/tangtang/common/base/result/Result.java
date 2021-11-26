package com.tangtang.common.base.result;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Result<T> implements Serializable {

    private int code;

    private String msg;

    private T data;

}
