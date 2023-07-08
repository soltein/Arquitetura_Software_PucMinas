package br.com.popfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication

public class PopFoodDeliveryApplication {
	public static void main(String[] args) {
		SpringApplication.run(PopFoodDeliveryApplication.class, args);
	}
}
