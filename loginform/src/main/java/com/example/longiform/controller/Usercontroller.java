package com.example.longiform.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.longiform.domain.User;
import com.example.longiform.service.Userservice;

@Controller

public class Usercontroller
{
     @Autowired
	private Userservice userservice;
	
	
	@GetMapping("/login")
	public Modalandview login() {

	 Modalandview mav=new Modalandview("login");
	mav.addobject("user",new User());
	return mav;
	
	}
	@PostMapping("/login")
	public String login(@ModalAttributes("user")User user)
	{
		User oauthUser =userservice.login(user.getUsername(),user.getPassword());
		System.out.print(oauthUser);
		if(Objects.nonNull(oauthUser))
		{
			return "redirect:/";
		}
		else
		{
			return "redirect:/login";
		}
	}
	
	
}
