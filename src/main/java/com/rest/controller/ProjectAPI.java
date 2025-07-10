package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entities.Project;
import com.rest.services.ProjectService;
import com.rest.utilities.RecordAlreadyExistsException;
import com.rest.utilities.RecordNotFoundException;

@RestController
@RequestMapping("/api/projects")
public class ProjectAPI {
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("")
	public List<Project> getProjects() {
		return projectService.getProjects();
	}
	@GetMapping("/{pno}")
	public ResponseEntity<Project> getProjectByPno(@PathVariable Integer pno) throws RecordNotFoundException {
		return ResponseEntity.ok (projectService.getProjectByPno(pno));
		
	}

	@PostMapping("")
	public ResponseEntity<Object> addProject(@RequestBody Project project) throws RecordAlreadyExistsException {
	
			projectService.addProject(project);
			return new ResponseEntity<>(project,HttpStatus.CREATED); // Return the added project

	}
	@RequestMapping(value="",method = {RequestMethod.PUT, RequestMethod.PATCH})
	public ResponseEntity<Object> updateProject(@RequestBody Project project) throws RecordNotFoundException {
		projectService.updateProject(project);
		return new ResponseEntity<>(project,HttpStatus.OK); // Return the updated project
	}
}
