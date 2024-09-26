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
			
			queryForStudents(student);
		};

	}

	private void queryForStudents(StudentDao student) {
		List<Student> studentList = student.findAll();
		for(Student s : studentList) {
			System.out.println(s);
		}
		
	}
}
