package com.example.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class EmployeeDaoImpl implements EmployeeDao {

	private EntityManager manager;

	@Autowired
	public EmployeeDaoImpl(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public List<Employee> findAll() {
		TypedQuery<Employee> empList = manager.createQuery("FROM Employee ", Employee.class);

		return empList.getResultList();
	}

}
