package com.xworkz.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.xworkz.database.databasedemo.entity.Person;
import com.xworkz.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringBaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All person-> {}", dao.findAllPerson());
		logger.info("Person By Id -> {}", dao.findById(10002));
		logger.info("Person details -> {}", dao.findByName("Shivu"));
		logger.info("Person details by Location -> {}", dao.findByLocation("Pune"));
		// logger.info("Deleted person details by id -> No of rows deleted {}",
		// dao.deleteById(10002));
		// logger.info("Deleting by name -> No of rows deteled
		// {}",dao.deleteByIdOrName(10003, "Shivu"));
		// logger.info("Inserting into person -> rows added {}",dao.insert(new
		// Person(10006, "Mayuresh", "Mumbai", new Date())));
		// logger.info("Updating the details -> rows affected {}", dao.update(new
		// Person(10003, "Dyamanna", "Guledgudda", new Date())));
		logger.info("Inserting the details -> rows affected {}",
				dao.insert(new Person(10008, "Ganesh", "Hydrabad", new Date())));
		// logger.info("updating the person details -> rows affected {}",
		// dao.update(new Person(10008, "Ganesh", "Noida", new Date())));
		logger.info("Updating the details -> rows affected {}",
				dao.update(new Person(10008, "Ganesh", "Noida", new Date())));
	}
}
