package com.gl.springboot.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gl.springboot.security.model.Role;
import com.gl.springboot.security.model.User;

public interface UserRepository extends JpaRepository<Role,Integer> {
	 @Query("SELECT u FROM User u WHERE u.username = ?1")
	    public User getUserByUsername(String username);
}
