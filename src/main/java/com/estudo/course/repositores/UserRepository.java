package com.estudo.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	
	

}
