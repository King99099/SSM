package com.atguigu.spring.service.impl;

import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;

/**
 * ClassName:UserServiceImpl
 * Package: com.atguigu.spring.service.impl
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/15 - 16:18
 * @Version: v1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
