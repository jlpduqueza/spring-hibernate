package com.shoppingapp.repository;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.shoppingapp.domain.Login;
import com.shoppingapp.domain.User;

public class UserRepositoryImpl implements UserRepository {
	
    private Session session;
    
    public UserRepositoryImpl(Session session) {
        this.session = session;
    }
	
	@Override
	public User findUser(User user) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public User findUserById(int id) {
		
		return session.find(User.class, id);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public User findUserByUsernameAndPassword(String username, String password) {
		
		Query query = session.createQuery("from User where username = :username AND password = :password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		
		User user = (User) query.uniqueResult();
		
		if(user == null) {
			return null;
		}
		
		return user;
	}

	@Override
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

}
