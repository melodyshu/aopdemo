package com.example.aop3;

import com.example.aop3.Greeting;
import org.springframework.stereotype.Component;

@Component
public class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("你好,"+name);
    }
}
