package com.springprojeto.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springprojeto.curso.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{

}
