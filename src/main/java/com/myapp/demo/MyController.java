package com.myapp.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyController {
	
	@RequestMapping("api/health")
	public String sayHello() {
		return "API is good"; 
	}
	
	@RequestMapping("api/ping")
	public String sayPing() {
		return "API Ping is good"; 
	}
}
