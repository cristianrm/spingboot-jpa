package com.estudo.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {
	
	

}
