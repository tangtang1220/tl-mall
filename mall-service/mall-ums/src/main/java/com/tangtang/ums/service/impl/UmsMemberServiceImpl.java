package com.tangtang.ums.service.impl;

import com.tangtang.ums.entity.UmsMember;
import com.tangtang.ums.entity.dto.UmsMemberLoginParamDTO;
import com.tangtang.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.tangtang.ums.mapper.UmsMemberMapper;
import com.tangtang.ums.service.UmsMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author tangliang
 * @since 2021-11-23
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public String register(UmsMemberRegisterParamDTO umsMemberRegisterParamDTO) {
        UmsMember umsMember = new UmsMember();
        BeanUtils.copyProperties(umsMemberRegisterParamDTO, umsMember);
        umsMember.setPassword(passwordEncoder.encode(umsMemberRegisterParamDTO.getPassword()));
        umsMemberMapper.insert(umsMember);
        return "success";
    }

    @Override
    public String login(UmsMemberLoginParamDTO umsMemberLoginParamDTO) {
        UmsMember umsMember = umsMemberMapper.selectByName(umsMemberLoginParamDTO.getUsername());
        if (umsMember != null) {
            String passwordDB = umsMember.getPassword();
            if (!umsMemberLoginParamDTO.getPassword().equals(passwordDB)) {
                return "密码不正确";
            }
        }
        System.out.println("登录成功");
        return "token";
    }
}
