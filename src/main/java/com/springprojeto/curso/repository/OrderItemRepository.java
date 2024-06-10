package com.springprojeto.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springprojeto.curso.entities.OrderItem;
import com.springprojeto.curso.entities.PK.OrderItemPK;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK>{

	

}
