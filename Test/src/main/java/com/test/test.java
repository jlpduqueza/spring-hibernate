package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		
		User user = new User();
		
		user.setId(102);
		user.setUsername("krvalios");
		user.setPassword("kat123");
		
		Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(user);
		
		tx.commit();
		
	}

}
