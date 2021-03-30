package com.imooc.spring.ioc.service;

import com.imooc.spring.ioc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // Autowired 加在这里将不在执行 set 方法
    // SpringIoc 容器会自动通过反射技术将 private 修饰符自动改为 public，直接赋值
    @Autowired
    private UserDao userDao;

    public UserService() {
        System.out.println("正在创建 UserService : " + this.userDao);
    }

    public UserDao getUserDao() {
        return userDao;
    }

/*    @Autowired
    public void setUserDao(UserDao userDao) {
        System.out.println("setUao : " + userDao);
        this.userDao = userDao;
    }*/
}
