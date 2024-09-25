package com.example.lazy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lazy.common.Coach;

@RestController
public class DemoController {

	private Coach coach;

	@Autowired
	public void setCoach(@Qualifier("baseBallCoach") Coach coach) {
		this.coach = coach;
	}

	@GetMapping("/daily-workout")
	public String dailyWorkout() {
		return coach.getWorkOutDaily();
	}
}
