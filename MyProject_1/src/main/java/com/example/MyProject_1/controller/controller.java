package com.example.MyProject_1.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class controller {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
}
