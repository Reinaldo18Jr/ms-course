package com.example.hroauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaClient
@SpringBootApplication
public class HrOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrOauthApplication.class, args);
	}

}
