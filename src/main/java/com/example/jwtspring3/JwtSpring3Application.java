package com.example.jwtspring3;

import com.example.jwtspring3.model.Role;
import com.example.jwtspring3.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtSpring3Application implements CommandLineRunner {
	@Autowired
	private RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(JwtSpring3Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		if (roleRepository.count() == 0) {
			Role admin = new Role("ROLE_ADMIN");
			Role user = new Role("ROLE_USER");
			roleRepository.save(admin);
			roleRepository.save(user);
		}
	}
}
