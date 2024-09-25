package com.example.config.comon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.config.comon.Coach;
import com.example.config.comon.SwimCoach;

@Configuration
public class SportConfig {

	@Bean("aqua")
	public Coach swimCoach() {
		return new SwimCoach();
	}
}
