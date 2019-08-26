package com.dxc.dtc.dso.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DeptServiceApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		   return application.sources(DeptServiceApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(DeptServiceApplication.class, args);
	}

}
