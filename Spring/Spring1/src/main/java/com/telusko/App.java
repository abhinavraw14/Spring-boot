package com.telusko;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
//        Create a container -> container creates an object inisde it.
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = (Alien) context.getBean("alien1");
//        obj1.setAge(21);

        System.out.println(obj1.getAge());
        obj1.code();

    }
}
