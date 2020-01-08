package com.example.aop3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application2.xml");
        Greeting greeting = (Greeting) context.getBean("greetingProxy");
        greeting.sayHello("王五");

        Apology apology=(Apology)greeting;
        apology.saySorry("王五2");
    }
}
