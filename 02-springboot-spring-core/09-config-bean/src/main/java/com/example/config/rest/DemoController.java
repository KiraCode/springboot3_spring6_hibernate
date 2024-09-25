package com.example.config.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.comon.Coach;

@RestController
public class DemoController {

	private Coach coach;

	@Autowired
	public DemoController(@Qualifier("aqua") Coach coach) {
		this.coach = coach;
	}

	@GetMapping("/daily-workout")
	public String dailyWorkout() {
		return coach.getWorkOutDaily();
	}

}
