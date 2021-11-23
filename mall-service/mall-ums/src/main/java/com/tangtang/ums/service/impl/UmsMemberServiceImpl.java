package com.tangtang.ums.service.impl;

import com.tangtang.ums.entity.UmsMember;
import com.tangtang.ums.mapper.UmsMemberMapper;
import com.tangtang.ums.service.UmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Override
    public String register() {
        UmsMember umsMember = new UmsMember();
        umsMember.setUsername("tangliang");
        umsMemberMapper.insert(umsMember);
        return "success";
    }
}
