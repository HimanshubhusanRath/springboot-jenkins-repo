package com.hr.springboot.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsApplication {

	private static Logger LOG = LoggerFactory.getLogger(SpringbootJenkinsApplication.class);
	
	@PostConstruct
	public void init()
	{
		LOG.info("SpringBootJenkins  - Application Started");
	}
	
	public static void main(String[] args) {
		LOG.info("SpringBootJenkins  - Application executing the main method");
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}

}
