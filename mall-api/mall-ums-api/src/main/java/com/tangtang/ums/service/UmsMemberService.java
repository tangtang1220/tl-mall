package com.tangtang.ums.service;

import com.tangtang.ums.entity.dto.UmsMemberLoginParamDTO;
import com.tangtang.ums.entity.dto.UmsMemberRegisterParamDTO;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author tangliang
 * @since 2021-11-23
 */
public interface UmsMemberService {

    String register(UmsMemberRegisterParamDTO umsMemberRegisterParamDTO);

    String login(UmsMemberLoginParamDTO umsMemberLoginParamDTO);
}
