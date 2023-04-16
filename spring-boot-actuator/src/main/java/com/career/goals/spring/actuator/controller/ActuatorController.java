package com.career.goals.spring.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("spring-boot-actuator")
public class ActuatorController {
	
	@GetMapping("/test")
	public String testEndPoint() {
		return "spring boot actuator example";
		
	}

}
