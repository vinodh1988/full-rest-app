package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
