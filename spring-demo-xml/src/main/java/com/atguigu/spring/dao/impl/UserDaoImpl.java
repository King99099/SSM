package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.UserDao;

/**
 * ClassName:UserDaoImpl
 * Package: com.atguigu.spring.dao.impl
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/15 - 16:16
 * @Version: v1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("user saved successfully");
    }
}
