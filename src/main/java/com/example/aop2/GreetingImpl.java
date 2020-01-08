package com.example.aop2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("你好,"+name);
        throw new RuntimeException("Error...");
    }
}
