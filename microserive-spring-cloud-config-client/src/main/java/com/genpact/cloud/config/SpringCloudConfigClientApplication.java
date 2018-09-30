package com.genpact.cloud.config;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringCloudConfigClientApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);
	}
}
