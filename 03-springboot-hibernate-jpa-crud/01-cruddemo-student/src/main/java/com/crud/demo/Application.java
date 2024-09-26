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
//			createStudent(student);
			
//			createMultipleStudents(student);
			
//			readObject(student);
			
			queryForStudents(student);
		};

	}

	private void queryForStudents(StudentDao student) {
		List<Student> studentList = student.findAll();
		for(Student s : studentList) {
			System.out.println(s);
		}
		
	}

	private void readObject(StudentDao studentDao) {
		System.out.println("Cretaing new Student Object... ");
		Student student = new Student("Daffy", "donqui", "daffydonqui@gmail.com");

		System.out.println("Saving the Student... ");
		studentDao.save(student);

		int id = student.getId();
		System.out.println("Saved Student: Generated Id: " + student.getId());
		
		System.out.println("Retrieving Student with ID: "+id);
		Student myStudent = studentDao.fingById(id);
		
		System.out.println("Found the Student: "+myStudent);
	}

	private void createMultipleStudents(StudentDao studentDao) {

		System.out.println("Cretaing 3 Student Object... ");
		Student student1 = new Student("John", "Wick", "johnwick@gmail.com");
		Student student2 = new Student("Mary", "Blake", "maryblake@gmail.com");
		Student student3 = new Student("Bonita", "Ronita", "bonitaronita@gmail.com");

		System.out.println("Saving the Student... ");
		studentDao.save(student1);
		studentDao.save(student2);
		studentDao.save(student3);

		System.out.println("Saved Student/ Generated Id: " + student1.getId());
		System.out.println("Saved Student/ Generated Id: " + student2.getId());
		System.out.println("Saved Student/ Generated Id: " + student3.getId());

	}

	private void createStudent(StudentDao studentDao) {
		System.out.println("Cretaing new Student Object... ");
		Student student = new Student("Paul", "HeyMan", "paulheyman@gmail.com");

		System.out.println("Saving the Student... ");
		studentDao.save(student);

		System.out.println("Saved Student/ Generated Id: " + student.getId());
	}
}
