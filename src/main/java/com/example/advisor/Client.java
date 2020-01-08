package com.example.advisor;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application3.xml");
        Greeting greeting = (Greeting) context.getBean("greetingProxy");
        greeting.sayHello("王五");
        greeting.goodMorning("王五");
        greeting.goodNight("王五");

    }
}
