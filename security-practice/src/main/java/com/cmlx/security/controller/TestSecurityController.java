package com.cmlx.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestSecurityController {

    @GetMapping("hello")
    public String hello() {
        return "hello Security!!!";
    }


}
