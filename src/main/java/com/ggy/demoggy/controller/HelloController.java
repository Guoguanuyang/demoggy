package com.ggy.demoggy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/indexs")
    public String sayHello(){
        return "index";
    }
}