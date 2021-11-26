package com.tangtang.ums.entity.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UmsMemberRegisterParamDTO {

    private String username;

    private String password;

    private String icon;

    private String email;

    private String nickName;

    private String note;

}
