package com.shoppingapp.controller;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.shoppingapp.domain.Login;
import com.shoppingapp.domain.User;

public class UserController {
	
	public void addUser() {
		
		User user = new User();
		
		user.setId(104);
		user.setUsername("admin");
		user.setPassword("admin");
		
		Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(user);
		
		tx.commit();
	}
	
	@SuppressWarnings("rawtypes")
	public Boolean validateUser(Login login) {
		
		Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Query q = session.createQuery("select username, password from User where username = :u AND password = :p ");
		q.setParameter("u", login.getUsername());
		q.setParameter("p", login.getPassword());
		
		if(q.uniqueResult() == null) {
			return false;
		}
		
		return true;
	}
}
