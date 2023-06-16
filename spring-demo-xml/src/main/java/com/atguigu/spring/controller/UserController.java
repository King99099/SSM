package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;

/**
 * ClassName:UserController
 * Package: com.atguigu.spring.controller
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/15 - 16:14
 * @Version: v1.0
 */
public class UserController {
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private UserService userService;

    public void saveUser() {
        userService.saveUser();
    }
}
