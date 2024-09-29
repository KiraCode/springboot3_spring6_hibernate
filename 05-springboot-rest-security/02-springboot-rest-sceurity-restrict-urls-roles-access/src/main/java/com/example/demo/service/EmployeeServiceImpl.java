package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository repository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Employee> findAll() {
		return repository.findAll();
	}

	@Transactional
	@Override
	public Employee save(Employee employee) {
		return repository.save(employee);
	}

	@Override
	public Employee findById(int empId) {
		Optional<Employee> employeeOpt = repository.findById(empId);
		Employee employee = null;
		if (employeeOpt.isPresent()) {
			employee = employeeOpt.get();
		} else {
			throw new RuntimeException("Employee ID not found " + empId);
		}
		return employee;
	}

	@Transactional
	@Override
	public void delete(int empId) {
		Optional<Employee> employeeOpt = repository.findById(empId);
		if (employeeOpt.isPresent()) {
			repository.deleteById(empId);
		} else {
			throw new RuntimeException("Employee ID not found " + empId);
		}
	}
}