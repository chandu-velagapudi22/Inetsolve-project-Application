package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InetsolveProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(InetsolveProjectApplication.class, args);

		System.out.println("Welcome for InetSolve project");
		System.out.println(context.toString());
	}

}
