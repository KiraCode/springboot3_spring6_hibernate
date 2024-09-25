package com.example.scope.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CricketCoach implements Coach {

	public CricketCoach() {
		System.out.println("In Constructor: " + getClass().getSimpleName());
	}

	@Override
	public String getWorkOutDaily() {
		return "Practice fast bowling for 15 minutes continously!!!";
	}

}
