package com.xjlu.duboo.service;

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hi"+name+"====";
    }
}
