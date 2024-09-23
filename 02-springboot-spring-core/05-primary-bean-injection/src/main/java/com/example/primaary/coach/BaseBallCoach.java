package com.example.primaary.coach;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

	@Override
	public String getWorkOutDaily() {
		return "Spend 30 minutes in batting practice";
	}

}
