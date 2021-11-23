package com.tangtang.portal.web.controller;


import com.tangtang.ums.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 后台用户表 前端控制器
 * </p>
 *
 * @author tangliang
 * @since 2021-11-23
 */
@RestController
@RequestMapping("/user-member")
public class UserMemberController {

    @Autowired
    UmsMemberService umsMemberService;

    @PostMapping("/register")
    public String register() {
        return umsMemberService.register();
    }
}
