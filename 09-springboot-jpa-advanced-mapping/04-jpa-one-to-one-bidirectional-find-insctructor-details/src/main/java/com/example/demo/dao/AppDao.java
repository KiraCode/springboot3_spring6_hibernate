package com.example.demo.dao;

import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;

public interface AppDao {

	public void save(Instructor instructor);
	
	public Instructor findInstructorbyId(int id);

	public void delete(int id);
	
	public InstructorDetail findInstructorDetailbyId(int id);
}
