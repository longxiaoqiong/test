package com.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class serviceApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(serviceApplication.class).web(true).run(args);
	}
}