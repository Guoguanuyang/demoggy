package com.ggy.demoggy.service.Impl;

import com.ggy.demoggy.bean.UserBean;
import com.ggy.demoggy.mapper.UserMapper;
import com.ggy.demoggy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }
}
