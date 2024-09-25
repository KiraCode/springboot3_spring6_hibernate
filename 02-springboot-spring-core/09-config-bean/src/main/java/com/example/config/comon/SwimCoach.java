package com.example.config.comon;

public class SwimCoach implements Coach{

	public SwimCoach() {
		System.out.println("In Constructor : "+getClass().getSimpleName());
	}
	@Override
	public String getWorkOutDaily() {
		return "Swim 1000 meters as a warmup";
	}

}
