// (Inversion of Control and Dependency Injection)
package com.amey.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		// SPRING-BOOT OBJECT CREATION CODE
		ApplicationContext context =  SpringApplication.run(SpringBootDemoApplication.class, args);
		Alien obj = context.getBean(Alien.class);
		obj.code();
	}

}
