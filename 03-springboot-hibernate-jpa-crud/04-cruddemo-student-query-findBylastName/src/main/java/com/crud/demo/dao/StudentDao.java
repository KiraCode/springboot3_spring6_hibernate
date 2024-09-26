package com.crud.demo.dao;

import java.util.List;

import com.crud.demo.entity.Student;

public interface StudentDao {

	public void save(Student student);
	
	public Student fingById(int id);
	
	public List<Student> findAll();
	
	public List<Student> findByLastName(String lastName);
}
