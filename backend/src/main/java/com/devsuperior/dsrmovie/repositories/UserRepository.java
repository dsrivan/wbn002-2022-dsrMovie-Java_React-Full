package com.devsuperior.dsrmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsrmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
