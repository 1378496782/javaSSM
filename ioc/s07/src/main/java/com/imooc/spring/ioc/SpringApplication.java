package com.imooc.spring.ioc;

import com.imooc.spring.ioc.dao.UserDao;
import com.imooc.spring.ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        String[] ids = context.getBeanDefinitionNames();
//        for (String id : ids)
//            System.out.println(id + " : " + context.getBean(id));

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService.getUserDao());
    }
}
