package com.example.aop;

import org.springframework.aop.framework.ProxyFactory;

public class Client2 {
    public static void main(String[] args) {
        ProxyFactory proxyFactory=new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingAroundAdvice());
        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("张三");
    }
}
