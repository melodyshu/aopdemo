package com.example.aop2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Greeting greeting = (Greeting) context.getBean("greetingProxy");
        greeting.sayHello("李四");
    }
}
