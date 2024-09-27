package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDao {

	public List<Employee> findAll();
	
	public void save(Employee employee);
	
	public Employee findById(int empId);
	
	public void delete(int empId);
}
