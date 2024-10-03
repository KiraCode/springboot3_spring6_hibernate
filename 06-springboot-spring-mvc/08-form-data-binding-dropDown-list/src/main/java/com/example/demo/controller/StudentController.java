package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Student;

@Controller
public class StudentController {


	@GetMapping("/showSudentForm")
	public String showForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-form";

	}

	@PostMapping("/processStudentForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println(
				"First Name : " + theStudent.getFirstName() + " AND " + "Last Name : " + theStudent.getLastName());
		return "student-confirmation";
	}
}
