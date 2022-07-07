package com.TestBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TestBlog.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	User findByUsername(String username);
	
	User findByPassword(String password);
	
	User findByUsernameAndPassword(String username, String password);
}
