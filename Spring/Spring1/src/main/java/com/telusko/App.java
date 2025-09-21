package com.telusko;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
//        Create a container -> container creates an object inisde it.
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //This line basically creates a container for you.
        //Xml based configuration
        Alien obj1 = (Alien) context.getBean("alien1"); //getBean(XML id);
        obj1.code();
        Alien obj2 = (Alien) context.getBean("alien1"); //getBean(XML id);
        obj2.code();

    }
}
