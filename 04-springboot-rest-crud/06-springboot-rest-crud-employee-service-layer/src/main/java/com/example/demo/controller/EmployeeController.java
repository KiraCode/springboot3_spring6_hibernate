package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeController(EmployeeDao employeeDao){
		this.employeeDao = employeeDao;
	}
	
	@GetMapping("/employee-list")
	public List<Employee> employeeList(){
		return employeeDao.findAll();
	}
}
