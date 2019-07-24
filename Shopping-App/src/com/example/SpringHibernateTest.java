package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		HibernateDaoImpl dao = ctx.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		
		System.out.println(dao.getUsername());
	}
	
}
