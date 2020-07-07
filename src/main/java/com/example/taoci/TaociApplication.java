package com.example.taoci;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.taoci.dao")
public class TaociApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaociApplication.class, args);
    }

}
