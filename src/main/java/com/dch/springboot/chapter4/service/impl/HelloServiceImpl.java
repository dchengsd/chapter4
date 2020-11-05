package com.dch.springboot.chapter4.service.impl;

import com.dch.springboot.chapter4.service.HelloService;

import java.sql.SQLOutput;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        if(name == null || name.trim() == ""){
            throw new RuntimeException("parameter is null!!");
        }
        System.out.println("hello"+name);
        System.out.println("这是一个test!!!");
    }
}
