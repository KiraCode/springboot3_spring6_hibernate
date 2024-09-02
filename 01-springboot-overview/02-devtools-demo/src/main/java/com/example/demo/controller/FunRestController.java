package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/stayHard")
	public String stayHard() {
		return "Stay Hard";
	}
	
	@GetMapping("/fortune")
	public String fortune() {
		return "Today is my Lucky day";
	}
}
