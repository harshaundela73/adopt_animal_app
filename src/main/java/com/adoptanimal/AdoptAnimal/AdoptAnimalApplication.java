package com.adoptanimal.AdoptAnimal;

import com.adoptanimal.AdoptAnimal.Model.Animal;
import com.adoptanimal.AdoptAnimal.Model.User;
import com.adoptanimal.AdoptAnimal.Repository.AnimalRepository;
import com.adoptanimal.AdoptAnimal.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class AdoptAnimalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdoptAnimalApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository users, PasswordEncoder encoder, AnimalRepository animal) {
		return args -> {
			users.save(new User("user",encoder.encode("root"),"ROLE_USER"));
			users.save(new User("admin",encoder.encode("root"),"ROLE_USER,ROLE_ADMIN"));

			animal.save(new Animal(1L,"Jack","dog","husky",2,"brown","20/12/2021"));
			animal.save(new Animal(2L,"Sparrow","cat","Street",2,"black","01/05/2017"));


		};
	}

}
