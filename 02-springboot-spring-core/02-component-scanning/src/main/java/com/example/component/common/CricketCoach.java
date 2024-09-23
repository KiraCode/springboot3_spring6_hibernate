package com.example.component.common;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	@Override
	public String getWorkOutDaily() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes NOW!!!";
	}

}
