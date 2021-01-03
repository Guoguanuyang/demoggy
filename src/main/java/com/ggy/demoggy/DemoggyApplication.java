package com.ggy.demoggy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ggy.demoggy.mapper")
public class DemoggyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoggyApplication.class, args);
    }

}
