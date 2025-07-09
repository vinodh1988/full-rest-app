package com.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entities.Project;
import com.rest.repository.ProjectRepository;

@Service
public class ProjectService {
 @Autowired
 private ProjectRepository projectRepository;
 
  		public List<Project> getProjects() {
  				return projectRepository.findAll();
  		}
}
