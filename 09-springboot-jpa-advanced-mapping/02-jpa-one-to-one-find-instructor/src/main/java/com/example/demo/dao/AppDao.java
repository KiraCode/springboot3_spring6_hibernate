package com.example.demo.dao;

import com.example.demo.entity.Instructor;

public interface AppDao {

	public void save(Instructor instructor);
	
	public Instructor findInstructorbyId(int id);
}
