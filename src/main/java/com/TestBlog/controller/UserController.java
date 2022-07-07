package com.TestBlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TestBlog.entity.User;
import com.TestBlog.service.UserService;

@RestController
@CrossOrigin(origins = "*")

public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/authenticate")
	public Boolean authenticate(@RequestBody User user) {
//		String username = user.getUsername();
		String password = user.getPassword();
//		return service.userValidation(username, password);
		return service.userValidation(password);
	}
}
