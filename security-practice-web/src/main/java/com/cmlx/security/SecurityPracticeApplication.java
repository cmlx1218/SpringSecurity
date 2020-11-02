package com.cmlx.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cmlx.security.mapper")
public class SecurityPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityPracticeApplication.class, args);
    }

}
