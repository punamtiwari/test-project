package com.springboot.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Appliction {

	public static void main(String[] args) {
		 System.out.println("Test appliction i did this");
		ApplicationContext ct =  SpringApplication.run(ApplicationContext.class, args);
	}

}
