package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.AppDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(AppDao appDao) {
		return runner -> {
			deleteInstructor(appDao);
		};
	}
	private void deleteInstructor(AppDao appDao) {
		int id  = 2;
		System.out.println("Deleting the ID : "+id);
		appDao.delete(2);
	}
}
