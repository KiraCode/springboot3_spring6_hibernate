package com.example.primaary.coach;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach {

	@Override
	public String getWorkOutDaily() {
		return "Practice your backhand volley";
	}

}
