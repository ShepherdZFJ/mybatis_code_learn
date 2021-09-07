package com.shepherd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

//@MapperScan("com.shepherd.mapper")
public class FluentMybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FluentMybatisDemoApplication.class, args);
    }

}
