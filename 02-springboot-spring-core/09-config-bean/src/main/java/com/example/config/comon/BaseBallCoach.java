package com.example.config.comon;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

	public BaseBallCoach() {
		System.out.println("In Constructor: " + getClass().getSimpleName());
	}

	@Override
	public String getWorkOutDaily() {
		return "Spend 30 minutes in batting practice";
	}

}
