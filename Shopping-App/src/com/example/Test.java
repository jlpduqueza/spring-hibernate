package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.shoppingapp.domain.User;
import com.shoppingapp.repository.UserRepository;
import com.shoppingapp.repository.UserRepositoryImpl;

public class Test {
	
//	public static void main(String[] args) {
//		
//		User user = new User();
//		
//		Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
//		SessionFactory sf = con.buildSessionFactory();
//		Session session = sf.openSession();
//		session.getTransaction().begin();
//		
//		UserRepository userRepository = new UserRepositoryImpl(session);
//		System.out.println(userRepository.findUserById(110).getUsername());
//		
//		//add user
//		user.setId(40);
//		user.setUsername("test");
//		user.setPassword("test");
//		
//		session.save(user);
//		System.out.println("User created = " + user.getUsername());
//		
//		//fetch whole user object
//		user = session.get(User.class, 40);
//		
//		//getting all users
//		@SuppressWarnings("unchecked")
//		List<User> users = session.createQuery("FROM User").getResultList();
//		
//		if (users == null) {
//			System.out.println("No employee found . ");
//		} else {
//			for (User usr : users) {
//				System.out.println("Employee name= " + usr.getUsername() + ", Employee id " + usr.getId());
//			}
//		}
//		
//		//getting only 1 field
//		@SuppressWarnings("rawtypes")
//		Query query = session.createQuery("select username from User ");
//		@SuppressWarnings("unchecked")
//		List rows = query.list();
//		
//		for (Object row: rows) {
//		    System.out.println(" ------------------- ");
//		    System.out.println("username: " + row);
//		}
//		
//		//getting only 1 field
//		@SuppressWarnings("rawtypes")
//		Query query1 = session.createQuery("from User where id = :u ");
//		query1.setParameter("u", 40);
//		User user1 = (User) query1.uniqueResult();
//		
//		System.out.println(user1.getUsername());
//		
//		for (Object row: rows) {
//		    System.out.println(" ------------------- ");
//		    System.out.println("username: " + row);
//		}
//		
//		//getting only 2 field
//	     Query q = session.createQuery("select u.id, u.username from User u");
//	     List<Object[]> rows1= (List<Object[]>)q.list();
//	     for(Object[] row: rows1){
//	    	 System.out.println(" ------------------- ");
//	    	 System.out.println("id: " + row[0]);
//	    	 System.out.println("username: " + row[1]);
//	     }
//
//		// remove and entity
//	    System.out.println("removing user");
//		session.remove(user);
//		
//		session.getTransaction().commit();
//		
//		// close the session
//		System.out.println("closing session");
//		session.close();
//		sf.close();
//		
//
//		
//		
//	}
}
