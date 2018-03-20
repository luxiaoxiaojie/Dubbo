package com.xjlu.duboo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceStart {
    public static void main(String[] args) {
        // 加载applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        System.out.println("start dubbo");
        System.out.println("生产者服务已经注册成功!");
        try {
            System.in.read();//让此程序一直跑，表示一直提供服务
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
