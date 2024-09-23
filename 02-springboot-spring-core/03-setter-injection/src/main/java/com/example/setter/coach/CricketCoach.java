package com.example.setter.coach;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	@Override
	public String getWorkOutDaily() {
		return "Practice fast bowling for 15 minutes continously!!!";
	}

}
