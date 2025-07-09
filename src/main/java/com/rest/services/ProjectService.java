package com.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entities.Project;
import com.rest.repository.ProjectRepository;
import com.rest.utilities.RecordAlreadyExistsException;

@Service
public class ProjectService {
 @Autowired
 private ProjectRepository projectRepository;
 
  		public List<Project> getProjects() {
  				return projectRepository.findAll();
  		}
  		
  		public void addProject(Project project) throws RecordAlreadyExistsException {
  			    Project p = projectRepository.findByPno(project.getPno());
  			    if(p != null) {
  			        throw new RecordAlreadyExistsException();
  			    }
  				projectRepository.save(project);
  		}
}
/*
 * the save method of the JpaRepository works for both insert and update operations.
 */
