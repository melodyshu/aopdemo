package com.example.aop;

public class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("你好,"+name);
    }
}
