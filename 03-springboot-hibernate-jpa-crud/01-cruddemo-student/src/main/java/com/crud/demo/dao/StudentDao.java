package com.crud.demo.dao;

import com.crud.demo.entity.Student;

public interface StudentDao {

	public void save(Student student);
	
	public Student fingById(int id);
}
