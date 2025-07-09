package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entities.Person;
import com.rest.services.PeopleService;

@RestController
@RequestMapping("/api/people")
public class PeopleAPI {
@Autowired
private PeopleService peopleService;
@GetMapping("")
public List<Person> getPeople() {
	return peopleService.getPeople();
	}

@PostMapping("")
public ResponseEntity<Person> addPerson(@RequestBody Person person) {
	// Logic to add a person (not implemented in this example)
    person=peopleService.addPerson(person);
	return new ResponseEntity<>(person, HttpStatus.CREATED); // Return the added person for now
	}
}
