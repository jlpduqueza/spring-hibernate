package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class JpaHibernateMethods {
	
	public static void main(String[] args) {

		Name name = new Name();
		name.setName("test");
		
		UserDetails user = new UserDetails();
		user.setUsername("test");
		user.setName(name);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
	}
	
}
