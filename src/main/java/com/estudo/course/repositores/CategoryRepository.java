package com.estudo.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {
	
	

}
