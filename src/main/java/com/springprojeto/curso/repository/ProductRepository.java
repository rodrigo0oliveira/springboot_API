package com.springprojeto.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springprojeto.curso.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
