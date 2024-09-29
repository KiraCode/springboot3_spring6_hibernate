package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

		if (employee == null) {
			throw new RuntimeException("Employee ID not Found : " + empId);
		}
		return employee;
	}

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	@DeleteMapping("/employees/{empId}")
	public String deleteEmployee(@PathVariable int empId) {
		Employee employee = employeeService.findById(empId);

		if (employee == null) {
			throw new RuntimeException("Employee ID not Found : " + empId);
		}
		employeeService.delete(empId);
		return "Deleted Employee ID : " + empId;
	}
}
