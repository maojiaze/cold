package com.example.cold;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.cold.mapper")
public class ColdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColdApplication.class, args);
    }

}
