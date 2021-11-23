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
    void testInsert(){
        UmsMember t = new UmsMember();
        t.setUsername("tang");
        t.setStatus(0);
        umsMemberMapper.insert(t);
    }
}