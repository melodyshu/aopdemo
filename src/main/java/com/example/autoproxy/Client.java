package com.example.autoproxy;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application4.xml");
        Greeting greeting = context.getBean(GreetingImpl.class);
        greeting.sayHello("王五");
        greeting.goodMorning("王五");
        greeting.goodNight("王五");

    }
}
