package com.hr.springboot.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest 
class SpringbootJenkinsApplicationTests {
	
	private static Logger LOG = LoggerFactory.getLogger(SpringbootJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		LOG.info("Executing test case );
		assertEquals(true, true);
	}

}
