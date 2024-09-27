package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@Override
	public Employee save(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee findById(int empId) {
		return employeeDao.findById(empId);
	}

	@Override
	public void delete(int empId) {
		employeeDao.delete(empId);
	}
}