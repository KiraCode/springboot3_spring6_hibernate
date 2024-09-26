package com.crud.demo;

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
			updateStudent(student);
		};

	}

	private void updateStudent(StudentDao studentDao) {
		int studentId = 1;
		System.out.println("Getting Student with Id: " + studentId);
		Student student = studentDao.findById(studentId);

		System.out.println("Updating Student... ");
		student.setFirstName("Paul");
		studentDao.update(student);
		System.out.println("Updated Student: " + student);
	}

}
