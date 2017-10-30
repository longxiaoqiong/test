package com.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;
    
    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService() {
    	String json=restTemplate.getForEntity("http://test-service/add?a=10&b=20", String.class).getBody();
        return json;
    }
    
    public String addServiceFallback() {
        return "error";
    }
}
