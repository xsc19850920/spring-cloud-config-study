package com.genpact.cloud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCloudConfigClientController {
	
	@Value("${profile}")
	private String profile;
	
	
	@Autowired
	private Environment env;

	
	@GetMapping("/profile")
	public String getEnv() {
		return String.format("profile from value : %s, from env : %s", profile,env.getProperty("profile")) ;
	}
}
