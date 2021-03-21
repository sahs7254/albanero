package com.example.longiform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.longiform.domain.User;

@Repository

public interface Userrepository extends JpaRepository<User,login> {
	User findbyusernameandpassword(String username, String password);

}
