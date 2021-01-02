package com.ggy.demoggy.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//Api注解，描述信息 可通过tag进行分类
@Api(value = "HelloController", description = "HelloController")
public class HelloController {

    //方法描述
    @ApiOperation(notes = "添加人员", value = "addPerson")
    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

    //方法描述
    @ApiOperation(notes = "拉拉", value = "lulu")
    @RequestMapping("/hello")
    public Object introduce(){
        String str = "nihao 美女";
        return str;
    }
}