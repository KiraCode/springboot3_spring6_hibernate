package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.AppDao;
import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDao appDao) {
		return runner -> {
			createIstructor(appDao);
		};
	}

	private void createIstructor(AppDao appDao) {
		Instructor instructor = new Instructor("Alexa", "Bliss", "alexabliss@gmail.com");
		InstructorDetail instructorDetail = new InstructorDetail("www.fight.com", "wrestle");
		instructor.setInstructorDetail(instructorDetail);
		appDao.save(instructor);
	}
}
