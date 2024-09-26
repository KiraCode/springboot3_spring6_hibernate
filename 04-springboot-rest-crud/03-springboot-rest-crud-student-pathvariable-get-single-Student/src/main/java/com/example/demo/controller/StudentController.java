package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentController {

	private List<Student> studentList;

	@PostConstruct
	public void loadData() {
		studentList = new ArrayList<>();
		studentList.add(new Student("John", "Wick"));
		studentList.add(new Student("Ronaki", "Sanki"));
		studentList.add(new Student("Marry", "Smith"));
	}

	@GetMapping("/student-list")
	public List<Student> getStudents() {
		return studentList;
	}
	
	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		return studentList.get(studentId);
	}
}
