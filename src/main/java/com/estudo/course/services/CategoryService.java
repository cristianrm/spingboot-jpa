package com.estudo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.course.entities.Category;
import com.estudo.course.repositores.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoriaRepository;

	public List<Category> findAll() {
		return categoriaRepository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = categoriaRepository.findById(id);
		return obj.get();

	}

}
