package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

	@GetMapping("/student-list")
	public List<Student> getStudents() {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("John", "Wick"));
		studentList.add(new Student("Ronaki", "Sanki"));
		studentList.add(new Student("Marry", "Smith"));

		return studentList;
	}
}
