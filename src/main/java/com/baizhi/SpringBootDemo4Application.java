package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baizhi.mapper")
public class SpringBootDemo4Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo4Application.class, args);
    }
}
