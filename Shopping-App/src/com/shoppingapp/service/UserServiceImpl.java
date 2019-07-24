package com.shoppingapp.service;

import org.hibernate.Session;

import com.shoppingapp.domain.Login;
import com.shoppingapp.repository.UserRepository;
import com.shoppingapp.repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService{

	private Session session;
	private UserRepository userRepository;
	
	public UserServiceImpl(Session session) {
		this.session = session;
		userRepository = new UserRepositoryImpl(session);
	}
	
	@Override
	public Boolean isUserValid(Login login) {
		
		userRepository.validateUser(login);
		
		return null;
	}
}
