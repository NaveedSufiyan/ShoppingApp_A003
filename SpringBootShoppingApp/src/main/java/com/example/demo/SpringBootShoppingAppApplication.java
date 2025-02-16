package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.demo.service.ProductService;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBootShoppingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootShoppingAppApplication.class, args);
	}

}


