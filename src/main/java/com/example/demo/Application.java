package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		/*
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		CustomerService c1s = new CustomerService();
		
		c1.setCountry("Kuwait");
		c1.setMobile("55112234");
		c1.setName("Ahmad");
		c1.setEmail("ahmad@knet.com.kw");
		c1.setDob("1993-12-12");
		
		c2.setCountry("KSA");
		c2.setMobile("55112233");
		c2.setName("Ali");
		c2.setEmail("ali@knet.com.kw");
		c2.setDob("1995-06-02");
		
		
		c1s.create(c1);
		c1s.create(c2);
	*/

	}

}
