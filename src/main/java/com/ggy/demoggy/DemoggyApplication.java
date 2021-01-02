package com.ggy.demoggy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ggy.demoggy.dao")
@SpringBootApplication
public class DemoggyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoggyApplication.class, args);
    }

}
