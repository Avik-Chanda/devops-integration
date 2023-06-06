package com.devopsintegration.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DevopsIntegrationApplication {

	public static Logger logger = LoggerFactory.getLogger(DevopsIntegrationApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started successfully");
	}

	public static void main(String[] args) {
		logger.info("Application executed successfully");
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}
