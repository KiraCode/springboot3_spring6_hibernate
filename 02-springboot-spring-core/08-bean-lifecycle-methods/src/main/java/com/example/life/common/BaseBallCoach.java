package com.example.life.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class BaseBallCoach implements Coach {

	public BaseBallCoach() {
		System.out.println("In Constructor: " + getClass().getSimpleName());
	}

	@PostConstruct
	public void construct() {
		System.out.println("Inside construct() " + getClass().getSimpleName());
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy() " + getClass().getSimpleName());
	}

	@Override
	public String getWorkOutDaily() {
		return "Spend 30 minutes in batting practice";
	}

}
