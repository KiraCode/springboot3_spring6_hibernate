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
			deleteAllStudent(student);
		};

	}

	private void deleteAllStudent(StudentDao studentDao) {
		System.out.println("Deleting All Student");
		int rowCount = studentDao.deleteAll();
		System.out.println("Deleted Row Count " + rowCount);

	}

}
