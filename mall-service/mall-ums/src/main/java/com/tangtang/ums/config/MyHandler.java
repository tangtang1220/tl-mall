package com.tangtang.ums.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        System.out.println("插入时间设置");
        metaObject.setValue("gmtCreate", LocalDateTime.now());
        metaObject.setValue("gmtModified", LocalDateTime.now());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        System.out.println("更新时间设置");
        metaObject.setValue("gmtModified", LocalDateTime.now());
    }
}
