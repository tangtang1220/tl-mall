package com.tangtang.portal.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.tangtang")
@MapperScan("com.tangtang.ums.mapper")
public class PortalWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalWebApplication.class, args);
    }
}
