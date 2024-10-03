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
		Instructor instructor1 = new Instructor("Chad", "Darby", "chaddarby@gmail.com");
		InstructorDetail instructorDetail1 = new InstructorDetail("www.luv2code.com", "coding");
		instructor1.setInstructorDetail(instructorDetail1);
		
		Instructor instructor2 = new Instructor("Alexa", "Bliss", "alexabliss@gmail.com");
		InstructorDetail instructorDetail2 = new InstructorDetail("www.fight.com", "wrestle");
		instructor2.setInstructorDetail(instructorDetail2);
		appDao.save(instructor1);
		appDao.save(instructor2);

	}
}
