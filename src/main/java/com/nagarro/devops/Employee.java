package com.nagarro.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
	
	@GetMapping("/name")
	public String employeeName() {
		return "Prasanth";
	}
}
