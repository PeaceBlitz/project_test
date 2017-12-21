package com.baiwang.boot.custom.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// 开启通用注解扫描
@ComponentScan(basePackages = {"com.baiwang.boot", "com.baiwang.cloud"})
public class CustomApplication extends SpringBootServletInitializer
{
    /**
     * 实现SpringBootServletInitializer可以让spring-boot项目在web容器中运行
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(CustomApplication.class);
    }
    
    public static void main(String[] args)
    {
        SpringApplication.run(CustomApplication.class, args);
    }
}
