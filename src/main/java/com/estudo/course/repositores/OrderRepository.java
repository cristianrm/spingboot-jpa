package com.estudo.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
