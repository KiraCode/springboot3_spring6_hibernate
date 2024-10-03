package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class AppDaoImpl implements AppDao {

	private EntityManager entityManager;

	@Autowired
	public AppDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void save(Instructor instructor) {
		entityManager.persist(instructor);
	}

	@Override
	public Instructor findInstructorbyId(int id) {
		return entityManager.find(Instructor.class, id);
	}

	@Override
	@Transactional
	public void delete(int id) {
		Instructor instructor = entityManager.find(Instructor.class, id);
		entityManager.remove(instructor);
		System.out.println("Successfully Removed ID : "+id);
	}

	@Override
	public InstructorDetail findInstructorDetailbyId(int id) {
		return entityManager.find(InstructorDetail.class, id);
	}

}
