package com.estudo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.course.entities.Order;
import com.estudo.course.repositores.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository OrderRepository;

	public List<Order> findAll() {
		return OrderRepository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = OrderRepository.findById(id);
		return obj.get();

	}

}
