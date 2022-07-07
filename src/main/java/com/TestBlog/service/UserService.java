package com.TestBlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestBlog.entity.User;
import com.TestBlog.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
//	public Boolean userValidation(String username, String password) {
//		User user = repository.findByUsernameAndPassword(username, password);
//		
//		System.out.println(user);
//		
//		if (repository.findByUsernameAndPassword(username, password) != null) {
//			return true;
//		}
//		return false;
//	}
	
	public Boolean userValidation(String password) {
		User user = repository.findByPassword(password);
		
		System.out.println(user);
		
		if (repository.findByPassword(password) != null) {
			return true;
		}
		return false;
	}
}
