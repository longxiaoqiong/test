package com.springcloud.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class eurekaApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(eurekaApplication.class).web(true).run(args);
	}
}