package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("employees")
	public List<Employee> employeeList() {
		return employeeService.findAll();
	}
	
	@GetMapping("/employees/{empId}")
	public Employee getEmployee(@PathVariable int empId) {
		Employee employee = employeeService.findById(empId);
		
		if(employee == null) {
			throw new RuntimeException("Employee ID not Found : "+empId);
		}
		return employee;
	}
}
