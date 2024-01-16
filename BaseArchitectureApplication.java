package com.cf.manipal.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cf.manipal.api.controller.v1.SampleController;

@SpringBootApplication
//@ComponentScan(basePackages={"com.cf.manipal.api.service.impl"})
//@ComponentScan(basePackageClasses = SampleController.class)
//@EnableJpaRepositories("com.cf.manipal.api.repository") 
public class BaseArchitectureApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BaseArchitectureApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BaseArchitectureApplication.class);
	}

}
