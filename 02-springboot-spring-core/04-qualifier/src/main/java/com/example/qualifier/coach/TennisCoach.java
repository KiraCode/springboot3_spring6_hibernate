package com.example.qualifier.coach;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getWorkOutDaily() {
		return "Practice your backhand volley";
	}

}
