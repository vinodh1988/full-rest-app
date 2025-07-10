package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entities.Department;

public interface DepartmentRepository  extends JpaRepository<Department, Integer> {
	


}
