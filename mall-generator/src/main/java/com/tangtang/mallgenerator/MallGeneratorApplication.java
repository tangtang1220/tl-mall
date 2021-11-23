package com.tangtang.mallgenerator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.springframework.boot.jdbc.DataSourceBuilder;

import java.util.Collections;

public class MallGeneratorApplication {

    public static void main(String[] args) {

        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/mall", "root", "root")
                .globalConfig(builder -> {
                    builder.author("tangliang") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:/github/tl-mall//mall-service/mall-ums/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.tangtang") // 设置父包名
                            .moduleName("ums") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:/github/tl-mall//mall-service/mall-ums/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("ums_member") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}
