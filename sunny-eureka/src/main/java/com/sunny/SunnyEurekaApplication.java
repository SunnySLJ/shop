package com.sunny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaServer
@SpringBootApplication
@ComponentScan(basePackages = "com.sunny")
public class SunnyEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunnyEurekaApplication.class, args);
	}
	
}
