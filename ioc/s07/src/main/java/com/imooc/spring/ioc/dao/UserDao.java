package com.imooc.spring.ioc.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public UserDao() {
        System.out.println("正在创建 UserDao : " + this);
    }
}
