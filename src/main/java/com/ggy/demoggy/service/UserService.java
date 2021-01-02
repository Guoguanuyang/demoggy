package com.ggy.demoggy.service;

import com.ggy.demoggy.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name, String password);

}
