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
        obj1.age = 21;

        System.out.println(obj1.age);
        //obj1.code();

        Alien obj2 = (Alien) context.getBean("alien1"); //getBean(XML id);
        System.out.println(obj2.age);
//      even if we have 2 different referencees but the object is same.
        //obj2.code();

        //SCOPES
        //In Spring Framework, scopes define the lifecycle and visibility of the
        // objects (beans) managed by the Spring container. By default, Spring beans
        // are Singleton, but you can change this with @Scope or XML configuration.

        // 1. Singleton (default)
        //One instance per Spring container.
        //Every request for that bean returns the same instance.
        //Best for stateless beans.

        // 2. Prototype
        //New instance every time it is requested from the container.
        //Useful for stateful beans.
        //it creates a object everytime we say getbeans


    }
}
