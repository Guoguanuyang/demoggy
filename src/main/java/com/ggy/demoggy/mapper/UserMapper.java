package com.ggy.demoggy.mapper;

import com.ggy.demoggy.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name, String password);
}
