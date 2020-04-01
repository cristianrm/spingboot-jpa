package com.estudo.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.estudo.course.entities.User;
import com.estudo.course.repositores.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Buddy", "buddy@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Cristian", "cristianrm@gmail.com", "999999999", "1234589896");
		
		userRepository.saveAll(Arrays.asList(u1,u2));

	}

}
