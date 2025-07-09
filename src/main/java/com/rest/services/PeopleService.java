package com.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.entities.Person;

@Service
public class PeopleService {
  List<Person> people = new ArrayList<>();
  {
	  people.add(new Person(1, "John", "New York"));
	  people.add(new Person(2, "Jane", "Los Angeles"));
	  people.add(new Person(3, "Doe", "Chicago"));
	  people.add(new Person(4, "Smith", "Houston"));
	  people.add(new Person(5, "Emily", "Phoenix"));
	  people.add(new Person(6, "Michael", "Philadelphia"));
	  people.add(new Person(7, "Thomas", "San Antonio"));
	  people.add(new Person(8, "Susan", "San Diego"));
	  people.add(new Person(9, "Alice", "Dallas"));
	  people.add(new Person(10, "Bob", "San Jose"));
  }
  
  public List<Person> getPeople() {
	return people;
  }
  
  public Person addPerson(Person person) {
	people.add(person);
	return person; // Return the added person
  }
}
