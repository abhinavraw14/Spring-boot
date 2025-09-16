package com.telusko.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		//System.out.println("Hello World");

//		Alien obj = new Alien();
//		obj.code();

//		how spring creates an object/beans
//		Spring Part
//		everytime the spring framework creates the object for it will be
//		available inside the container

		Alien obj = context.getBean(Alien.class);
		obj.code();

//		Laptop lap = context.getBean(Laptop.class);
//		lap.compile();


	}

}
