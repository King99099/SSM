package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName:UserController
 * Package: com.atguigu.spring.controller
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/15 - 16:14
 * @Version: v1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void saveUser() {
        userService.saveUser();
    }
}
