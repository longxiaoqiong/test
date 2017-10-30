package com.springcloud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.service.TestService;

@RestController
public class TestController {
	
    @Autowired
    TestService testService;
    
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return testService.addService();
    }
    
}