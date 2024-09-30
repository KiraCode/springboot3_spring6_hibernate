package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

	@RequestMapping("/processForm")
	public String sayHello() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letShoutsDude(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		String result = "Yo! "+name.toUpperCase();
		
		model.addAttribute("message", result);
		return "helloworld";
	}
}
