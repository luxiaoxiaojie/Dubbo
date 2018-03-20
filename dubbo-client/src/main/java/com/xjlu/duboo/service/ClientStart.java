package com.xjlu.duboo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientStart {
    public static void main(String[] args) {
        System.out.println("hello dubbo");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        DemoService service = (DemoService) context.getBean("testProviderService");

        String response = service.sayHello("luoxn28");
        System.out.println(response);
    }

}
