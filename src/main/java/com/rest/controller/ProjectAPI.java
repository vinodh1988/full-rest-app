package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entities.Project;
import com.rest.services.ProjectService;

@RestController
@RequestMapping("/api/projects")
public class ProjectAPI {
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("")
	public List<Project> getProjects() {
		return projectService.getProjects();
	}

}
