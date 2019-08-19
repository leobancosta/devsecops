package com.dxc.dtc.dos.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UserServiceApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		   return application.sources(UserServiceApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
