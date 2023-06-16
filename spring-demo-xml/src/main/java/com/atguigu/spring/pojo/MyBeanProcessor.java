package com.atguigu.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * ClassName:MyBeanProcessor
 * Package: com.atguigu.spring.pojo
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/15 - 15:23
 * @Version: v1.0
 */

/***
 * bean的后置处理器会在生命周期的初始化前后添加额外的操作，需要实现BeanPostProcessor接口，
 * 且配置到IOC容器中，需要注意的是，bean后置处理器不是单独针对某一个bean生效，而是针对IOC容
 * 器中所有bean都会执行
 */
public class MyBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("☆☆☆" + beanName + " = " + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("★★★" + beanName + " = " + bean);
        return bean;
    }

}
