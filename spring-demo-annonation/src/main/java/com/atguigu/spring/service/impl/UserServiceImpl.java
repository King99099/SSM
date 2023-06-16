package com.atguigu.spring.service.impl;

import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserServiceImpl
 * Package: com.atguigu.spring.service.impl
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/15 - 16:18
 * @Version: v1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
