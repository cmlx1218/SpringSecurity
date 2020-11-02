package com.cmlx.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author: CMLX
 * @Description: 根据配置类实现登录
 * @Date: create in 2020/11/2 9:44
 */
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String zq = passwordEncoder.encode("zq");
//        auth.inMemoryAuthentication().withUser("zq").password(zq).roles("admin");
//    }
//
//    @Bean
//    PasswordEncoder password(){
//        return new BCryptPasswordEncoder();
//    }
//}
