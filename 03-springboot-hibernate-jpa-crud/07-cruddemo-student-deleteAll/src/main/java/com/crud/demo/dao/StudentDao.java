package com.crud.demo.dao;

import java.util.List;

import com.crud.demo.entity.Student;

public interface StudentDao {

	public void save(Student student);
	
	public Student findById(int id);
	
	public List<Student> findAll();
	
	public List<Student> findByLastName(String lastName);
	
	public void update(Student student);
	
	public void delete(int id);
	
	public int deleteAll();
}
