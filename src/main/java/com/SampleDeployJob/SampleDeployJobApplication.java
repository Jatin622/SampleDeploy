package com.SampleDeployJob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.SampleDeployJob.SampleDeployJobApplication;

@SpringBootApplication
public class SampleDeployJobApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(SampleDeployJobApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleDeployJobApplication.class, args);
	}

}
