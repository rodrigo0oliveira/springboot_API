package com.springprojeto.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springprojeto.curso.entities.Order;
import com.springprojeto.curso.entities.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

	

	

}
