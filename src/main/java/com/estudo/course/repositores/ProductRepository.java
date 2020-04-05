package com.estudo.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.course.entities.Category;
import com.estudo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {
	
	

}
