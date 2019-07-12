package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: springdemo
 * @description:
 * @author: Rodger Luo
 * @create: 2018-09-19 18:04
 **/
@Controller
public class HelloController {

    @GetMapping(value = "/hello")
    public String index() {
        return "hello lz";
    }
}
