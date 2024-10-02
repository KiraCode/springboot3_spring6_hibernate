package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@GetMapping("/processForm")
	public String sayHello() {
		return "helloworld-form";
	}

	@PostMapping("/processFormVersionTwo")
	public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {

		String result = "Yo! My Friend " + name.toUpperCase();

		model.addAttribute("message", result);
		return "helloworld";
	}

}
