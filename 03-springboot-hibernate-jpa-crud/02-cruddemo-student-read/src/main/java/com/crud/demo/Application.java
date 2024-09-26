package com.crud.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.crud.demo.dao.StudentDao;
import com.crud.demo.entity.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao student) {
		return runner -> {

			readObject(student);
		};

	}

	private void readObject(StudentDao studentDao) {
		System.out.println("Cretaing new Student Object... ");
		Student student = new Student("Daffy", "donqui", "daffydonqui@gmail.com");

		System.out.println("Saving the Student... ");
		studentDao.save(student);

		int id = student.getId();
		System.out.println("Saved Student: Generated Id: " + student.getId());

		System.out.println("Retrieving Student with ID: " + id);
		Student myStudent = studentDao.findById(id);

		System.out.println("Found the Student: " + myStudent);
	}
}
