package com.example.Project;

import com.example.Project.Models.Address;
import com.example.Project.Models.Order;
import com.example.Project.Models.Product;
import com.example.Project.Models.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.swing.text.Document;
import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(ProductRepository repository) {
		return args -> {
			Product product = new Product(
				"produit", "test"
			);
			repository.insert(product);
		};

	}
}
