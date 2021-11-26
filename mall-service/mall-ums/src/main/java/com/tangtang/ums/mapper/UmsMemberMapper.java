package com.tangtang.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tangtang.ums.entity.UmsMember;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author tangliang
 * @since 2021-11-23
 */
@Repository
public interface UmsMemberMapper extends BaseMapper<UmsMember> {

    UmsMember selectByName(@Param("username") String username);
}
