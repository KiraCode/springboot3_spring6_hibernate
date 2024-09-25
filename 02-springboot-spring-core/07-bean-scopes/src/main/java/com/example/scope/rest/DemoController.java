package com.example.scope.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.scope.common.Coach;

@RestController
public class DemoController {

	private Coach coach;
	private Coach coach2;

	@Autowired
	public DemoController(@Qualifier("baseBallCoach") Coach coach, @Qualifier("baseBallCoach") Coach coach2) {
		this.coach = coach;
		this.coach2 = coach2;
	}

	@GetMapping("/daily-workout")
	public String dailyWorkout() {
		return coach.getWorkOutDaily();
	}
	
	@GetMapping("check")
	public String dailyCheck() {
		return "Compared Beans : coach = coach2 "+ (coach == coach2);
	}
}
