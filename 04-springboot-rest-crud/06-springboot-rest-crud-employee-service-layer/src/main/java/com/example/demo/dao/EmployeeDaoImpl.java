package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
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
