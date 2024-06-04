package com.springprojeto.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springprojeto.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
