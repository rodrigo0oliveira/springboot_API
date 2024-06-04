package com.springprojeto.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springprojeto.curso.entities.User;
import com.springprojeto.curso.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User(null,"lucas","lucas@gmail.com","999999","12345");
		User user2 = new User(null,"oliveira","oliveira@gmail.com","998831","23412");
		
		userRepository.saveAll(Arrays.asList(user1,user2));
		
	}
	
	

}
