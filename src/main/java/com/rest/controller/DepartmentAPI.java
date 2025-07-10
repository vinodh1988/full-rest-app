package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entities.Department;
import com.rest.services.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentAPI {
	@Autowired
	private DepartmentService departmentService;
	@GetMapping("")
	public List<Department> getDepartments() {
		// Logic to get departments (not implemented in this example)
		return departmentService.getDepartments();
	}
}
