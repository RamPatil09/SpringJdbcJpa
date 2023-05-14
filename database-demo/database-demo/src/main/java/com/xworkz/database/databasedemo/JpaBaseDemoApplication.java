package com.xworkz.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.xworkz.database.databasedemo.repository.PersonJpaRepository;

@SpringBootApplication
public class JpaBaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaBaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("All person-> {}", repository.findById(10001));
		logger.info("Fetching all data -> {}", repository.findAll());

	}
}
