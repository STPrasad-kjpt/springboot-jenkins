package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class EmployeeServiceApplication {
	
	public static Logger logger = LoggerFactory.getLogger(EmployeeServiceApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("init() method of EmployeeServiceApplication");
		logger.info("2nd line of init() method of EmployeeServiceApplication.");
	}

	public static void main(String[] args) {
		logger.info("main() method of EmployeeServiceApplication");
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
