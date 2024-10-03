package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.AppDao;
import com.example.demo.entity.Instructor;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDao appDao) {
		return runner -> {
			findInstructor(appDao);
		};
	}

	private void findInstructor(AppDao appDao) {
		int id = 2;
		
		System.out.println("Finding the Instructor By ID : "+id);
		Instructor instructor = appDao.findInstructorbyId(id);
		
		System.out.println("Instructor "+instructor);
		System.out.println("Instructor Details"+instructor.getInstructorDetail());
	}
}
