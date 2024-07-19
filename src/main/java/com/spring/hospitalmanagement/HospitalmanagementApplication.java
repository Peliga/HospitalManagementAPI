package com.spring.hospitalmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalmanagementApplication {
	private static  final Logger logger = LoggerFactory.getLogger(HospitalmanagementApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(HospitalmanagementApplication.class, args);

		logger.info("Application started updatedsss!!!");
	}

}
