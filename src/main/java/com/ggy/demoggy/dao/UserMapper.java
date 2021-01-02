package com.ggy.demoggy.dao;

import com.ggy.demoggy.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name, String password);
}
