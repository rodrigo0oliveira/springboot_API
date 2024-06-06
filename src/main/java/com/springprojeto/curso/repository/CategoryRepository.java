package com.springprojeto.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springprojeto.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
