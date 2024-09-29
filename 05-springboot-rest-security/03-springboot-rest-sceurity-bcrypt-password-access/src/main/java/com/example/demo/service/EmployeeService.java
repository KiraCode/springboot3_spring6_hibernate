package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee save(Employee employee);
	
	public Employee findById(int empId);
	
	public void delete(int empId);
}