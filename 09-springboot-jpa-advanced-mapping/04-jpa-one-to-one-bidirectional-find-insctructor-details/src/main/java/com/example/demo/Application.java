package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.AppDao;
import com.example.demo.entity.InstructorDetail;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDao appDao) {
		return runner -> {
			findInstructorDetailbyId(appDao);
		};
	}

	private void findInstructorDetailbyId(AppDao appDao) {
		int id = 1;
		InstructorDetail detail = appDao.findInstructorDetailbyId(id);
		System.out.println("Instructor Details : "+detail);
		System.out.println("Instructors : "+detail.getInstructor());
		
	}

}
