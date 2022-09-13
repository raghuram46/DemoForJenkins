package com.stg;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoForJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(DemoForJenkinsApplication.class);
	
	@PostConstruct
	public void print() {
		logger.info("Appication  started");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoForJenkinsApplication.class, args);
	}

}
