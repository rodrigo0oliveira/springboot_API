package com.springprojeto.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springprojeto.curso.entities.Order;
import com.springprojeto.curso.repository.OrderRepository;
import com.springprojeto.curso.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional <Order> order = orderRepository.findById(id);
		return order.orElseThrow(()-> new ResourceNotFoundException(id));
	}

}
