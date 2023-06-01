package com.example.sean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeanApplication implements CommandLineRunner {
	@Autowired
//	@Qualifier("ak47_b")
	Weapon weapon;

	public static void main(String[] args) {
		SpringApplication.run(SeanApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {
		weapon.fire();
	}
}
