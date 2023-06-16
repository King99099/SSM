package com.atguigu.spring;

import com.atguigu.spring.controller.UserController;
import com.atguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:SpringTest
 * Package: com.atguigu.spring
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/15 - 16:40
 * @Version: v1.0
 */
public class SpringTest {
    @Test
    public void testBeanAnnonation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        UserController userController = applicationContext.getBean(UserController.class);
        System.out.println("userController = " + userController);
        userController.saveUser();
    }
}
