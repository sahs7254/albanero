package com.example.longiform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.longiform.domain.User;
import com.example.longiform.repository.Userrepository;

@Service
public class Userservice 
{
     @Autowired
	private Userrepository repo;
	
	public User login(String username, String password)
	{
		User user = repo.findbyusernameandpassword(username , password);
		return user;
	}
	
}
