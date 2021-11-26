package com.tangtang.portal.web.controller;


import com.tangtang.common.base.enums.StateCodeEnum;
import com.tangtang.common.base.result.Result;
import com.tangtang.common.base.result.ResultWrapper;
import com.tangtang.ums.entity.dto.UmsMemberLoginParamDTO;
import com.tangtang.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.tangtang.ums.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * <p>
 * 后台用户表 前端控制器
 * </p>
 *
 * @author tangliang
 * @since 2021-11-23
 */
@Validated
@RestController
@RequestMapping("/user-member")
public class UserMemberController {

    @Autowired
    UmsMemberService umsMemberService;

    @PostMapping("/register")
    public Result register(@RequestBody @Valid UmsMemberRegisterParamDTO umsMemberRegisterParamDTO) {
        String register = umsMemberService.register(umsMemberRegisterParamDTO);
        return ResultWrapper.success(StateCodeEnum.SUCCESS);
    }

    @PostMapping("/login")
    public String login(@RequestBody UmsMemberLoginParamDTO umsMemberLoginParamDTO) {
        return umsMemberService.login(umsMemberLoginParamDTO);
    }
}
