package com.atguigu.spring.test;

import com.atguigu.spring.controller.UserController;
import com.atguigu.spring.demo.HelloWord;
import com.atguigu.spring.pojo.Student;
import com.atguigu.spring.pojo.User;
import com.atguigu.spring.pojo.UserFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:HelloWordTest
 * Package: com.atguigu.spring.test
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/15 - 11:28
 * @Version: v1.0
 */
public class HelloWordTest {
    @Test
    public void testIoc(){
        //通过读取类路径下的 XML 格式的配置文件创建 IOC 容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过ID获取bean
        //HelloWord helloWord = (HelloWord) applicationContext.getBean("helloWord");

        //通过类型获取bean
        //HelloWord helloWord = applicationContext.getBean(HelloWord.class);

        //通过ID 和 类型获取bean
        HelloWord helloWord = applicationContext.getBean("helloWord",HelloWord.class);
        helloWord.sayHello();
    }

    /***
     * 测试 setter 注入
     */
    @Test
    public void testDiBySetter(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = applicationContext.getBean(Student.class);
        System.out.println("student = " + student);
    }

    /**
     * 测试构造器注入
     */
    @Test
    public void testDiByConstructor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = applicationContext.getBean("studentTwo",Student.class);
        System.out.println(student);
    }

    @Test
    public void testDiByBeanScope(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = applicationContext.getBean(User.class);
        User user2 = applicationContext.getBean(User.class);
        System.out.println(user1.equals(user2));
    }

    /***
     * bean的生命周期
     *
     * bean对象创建（调用无参构造器）
     * 给bean对象设置属性
     * bean对象初始化之前操作（由bean的后置处理器负责）
     * bean对象初始化（需在配置bean时指定初始化方法）
     * bean对象初始化之后操作（由bean的后置处理器负责）
     * bean对象就绪可以使用
     * bean对象销毁（需在配置bean时指定销毁方法）
     * IOC容器关闭
     */
    @Test
    public void testBeanLife(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = applicationContext.getBean("user",User.class);
        System.out.println("生命周期：4、通过IOC容器获取bean并使用");
        //System.out.println(user);
        applicationContext.close();
    }

    @Test
    public void testFactoryBean(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("userFactoryBean");

        System.out.println("user = " + user);
    }

    /**
     * 基于xml的自动装配
     */
    @Test
    public void testAutowire(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = applicationContext.getBean(UserController.class);
        userController.saveUser();
    }
}
