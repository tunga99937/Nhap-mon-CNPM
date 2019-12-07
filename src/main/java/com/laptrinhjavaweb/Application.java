package com.laptrinhjavaweb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.laptrinhjavaweb.entity.Users;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hibernate_JPA");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		
//		Query query = entityManager.createQuery("SELECT e from USERS e ");
//		List<Users> list = (List<Users>)query.getResultList();
//		
//		for(Users x : list) {
//			System.out.println("username: "+ x.getUserName());
//		}
	}
}
