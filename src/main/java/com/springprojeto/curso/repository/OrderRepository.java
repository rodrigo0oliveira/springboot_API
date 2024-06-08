package com.springprojeto.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springprojeto.curso.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

	

	

}
