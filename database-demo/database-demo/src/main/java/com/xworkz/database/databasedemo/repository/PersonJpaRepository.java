package com.xworkz.database.databasedemo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xworkz.database.databasedemo.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

//repository
//Transtional
@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager entityManager;

	// for finding the entity using id
	public Person findById(int id) {
		return entityManager.find(Person.class, id);// JPA
	}

	// for inserting the entity
	public Person insert(Person person) {
		return entityManager.merge(person);
	}

	// for updating the entity
	public Person update(Person person) {
		return entityManager.merge(person);
	}

	// for deleting entity using id
	public void delete(int id) {
		Person person = findById(id);
		entityManager.remove(person);
	}

	// for fetching all the details from the Person
	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all", Person.class);
		return namedQuery.getResultList();
	}
}
