package com.genpact.cloud.config;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) throws ParseException {
//		System.setProperty("http.proxyHost", "58.2.221.9");
//		System.setProperty("http.proxyPort", "80");
//		System.setProperty("https.proxyHost", "58.2.221.9");
//		System.setProperty("https.proxyPort", "443");
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}
}
