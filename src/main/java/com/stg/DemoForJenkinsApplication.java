package com.stg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoForJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(DemoForJenkinsApplication.class);
	
	public void calculateSum(int a, int b) {
		logger.info("Test case executing");
		logger.info("sum of two numbers is : "+ (a+b));
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoForJenkinsApplication.class, args);
	}

}
