package com.devopsintegration.tutorial;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DevopsIntegrationApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(DevopsIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test executed as expected");
		assertEquals (true , true);
	}

}
