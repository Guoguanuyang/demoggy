package com.ggy.demoggy.controller;

import com.ggy.demoggy.bean.UserBean;
import com.ggy.demoggy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    UserService userService;

    @RequestMapping("/login")
    public String show() {
        return "login";
    }

    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public String login(String name, String password) {
        UserBean userBean = userService.loginIn(name, password);
        if (userBean != null) {
            return "success";
        } else {
            return "error";
        }
    }
}
