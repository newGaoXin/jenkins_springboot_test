package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: gaoxin
 * @Date: 2022/02/27/4:16 下午
 * @Description:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
