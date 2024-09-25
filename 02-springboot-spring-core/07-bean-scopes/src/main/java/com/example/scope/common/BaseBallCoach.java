package com.example.scope.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BaseBallCoach implements Coach {

	public BaseBallCoach() {
		System.out.println("In Constructor: " + getClass().getSimpleName());
	}

	@Override
	public String getWorkOutDaily() {
		return "Spend 30 minutes in batting practice";
	}

}
