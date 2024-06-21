package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.repo.RoleRepository;
import com.example.demo.repo.UserRepository;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello, this is run after the application starts!");
		
		// Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Create roles
        Role role1 = new Role("Admin");
        Role role2 = new Role("User");

        // Save roles first
        roleRepository.save(role1);
        roleRepository.save(role2);

        // Assign roles to users
        user1.addRole(role1);
        user2.addRole(role2);
        user1.addRole(role2);

        // Save users
        userRepository.save(user1);
        userRepository.save(user2);


	}

}
