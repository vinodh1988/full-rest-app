package com.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entities.Project;
import com.rest.repository.ProjectRepository;
import com.rest.utilities.RecordAlreadyExistsException;
import com.rest.utilities.RecordNotFoundException;

@Service
public class ProjectService {
 @Autowired
 private ProjectRepository projectRepository;
 
  		public List<Project> getProjects() {
  				return projectRepository.findAll();
  		}
  		public Project getProjectByPno(Integer pno) throws RecordNotFoundException {
  			
  				Project p= projectRepository.findByPno(pno);
  				if(p==null) {
  					throw new RecordNotFoundException();
  				}
  				return p;
  		}
  		public void addProject(Project project) throws RecordAlreadyExistsException {
  			    Project p = projectRepository.findByPno(project.getPno());
  			    if(p != null) {
  			        throw new RecordAlreadyExistsException();
  			    }
  				projectRepository.save(project);
  		}
  		public void updateProject(Project project) throws RecordNotFoundException {
  			    Project p = projectRepository.findByPno(project.getPno());
  			    if(p == null) {
  			        throw new RecordNotFoundException();
  			    }
  			project.setName(project.getName()==null ? p.getName() : project.getName());
  			project.setTechnology(project.getTechnology()==null ? p.getTechnology() : project.getTechnology());
  			project.setTeamsize(project.getTeamsize()==null ? p.getTeamsize() : project.getTeamsize());
  				projectRepository.save(project);
  		}
}
/*
 * the save method of the JpaRepository works for both insert and update operations.
 */
