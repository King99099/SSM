package com.atguigu.spring.pojo;

/**
 * ClassName:UserFactoryBean
 * Package: com.atguigu.spring.pojo
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/15 - 15:27
 * @Version: v1.0
 */

import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
