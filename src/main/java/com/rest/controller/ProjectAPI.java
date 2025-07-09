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

import com.rest.entities.Project;
import com.rest.services.ProjectService;
import com.rest.utilities.RecordAlreadyExistsException;

@RestController
@RequestMapping("/api/projects")
public class ProjectAPI {
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("")
	public List<Project> getProjects() {
		return projectService.getProjects();
	}

	@PostMapping("")
	public ResponseEntity<Object> addProject(@RequestBody Project project) {
		try {
			System.out.println("Adding project: " + project);
			projectService.addProject(project);
			return new ResponseEntity(project,HttpStatus.CREATED); // Return the added project
		} catch (RecordAlreadyExistsException e) {
			// Handle the exception as needed, e.g., log it or return an error response
			e.printStackTrace();
			return ResponseEntity.status(400).body(e.getMessage()); // Conflict status for already existing record
		}
		// Return the updated list of projects
	}
	
}
