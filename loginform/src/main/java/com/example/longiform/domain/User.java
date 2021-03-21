package com.example.longiform.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id
@Entity
@Table(name="login")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	private String username;
	private String password;
	
	public User()
	{
		
	}
	
	public User(String username, String password)
	{
		this.username=username;
		this.password=password;
	}
	public Long getId()
	{
		return Id;
	}
	public void setId(Long Id)
	{
		This.Id=Id;
	} 
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
}
