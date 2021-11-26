package com.tangtang.ums.mapper;

import com.tangtang.ums.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UmsMemberMapperTest {


    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Test
    void testInsert() {
        UmsMember t = new UmsMember();
        t.setUsername("tangaa");
        t.setStatus(0);
        umsMemberMapper.insert(t);
    }

    @Test
    void testUpdate() {
        UmsMember umsMember = umsMemberMapper.selectById(66);
        if (umsMember != null) {
            umsMember.setEmail("397632838@qq.com");
            umsMemberMapper.updateById(umsMember);
        }
    }
}