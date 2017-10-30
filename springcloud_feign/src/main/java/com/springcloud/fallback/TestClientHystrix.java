package com.springcloud.fallback;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.springcloud.service.TestService;

@Component
public class TestClientHystrix implements TestService {
	
	public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
		return -9999;
	}
}
