package com.javaSpringBoot.BasicRestApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicRestApplication.class, args);
		System.out.println("Basic Spring Application");
	}

}
