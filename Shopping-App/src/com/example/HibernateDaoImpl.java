package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateDaoImpl {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public String getUsername() {
		String hql = "select username From User where id = 2";
		Query query = getSessionFactory().openSession().createQuery(hql);
		return (String) query.uniqueResult();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
}
