package com.crud.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.crud.demo.dao.StudentDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao student) {
		return runner -> {
			deleteStudent(student);
		};

	}

	private void deleteStudent(StudentDao studentDao) {
		int studentId = 5;
		System.out.println("Deleting Student with Id: " + studentId);
		studentDao.delete(studentId);

	}

}
