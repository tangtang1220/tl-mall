package com.tangtang.ums.entity.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Data
@ToString
public class UmsMemberRegisterParamDTO {

    @NotEmpty(message = "用户名不能为空")
    private String username;

    private String password;

    private String icon;

    private String email;

    private String nickName;

    private String note;

}
