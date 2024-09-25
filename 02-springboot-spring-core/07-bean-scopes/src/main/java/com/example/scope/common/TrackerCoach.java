package com.example.scope.common;

import org.springframework.stereotype.Component;

@Component
public class TrackerCoach implements Coach {

	public TrackerCoach() {
		System.out.println("In Constructor: " + getClass().getSimpleName());
	}

	@Override
	public String getWorkOutDaily() {
		return "Run a hard 5k";
	}

}
