package com.ggy.demoggy;

import com.ggy.demoggy.bean.UserBean;
import com.ggy.demoggy.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static java.lang.System.out;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoggyApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("asd","123");
        out.println("该用户ID为：");
        out.println(userBean.getId());
    }

}
