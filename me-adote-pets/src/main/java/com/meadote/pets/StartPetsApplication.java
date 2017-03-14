package com.meadote.pets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StartPetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartPetsApplication.class, args);
	}
}
