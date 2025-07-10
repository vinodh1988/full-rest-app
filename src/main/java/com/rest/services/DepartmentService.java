package com.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entities.Department;
import com.rest.entities.Employee;
import com.rest.repository.DepartmentRepository;

@Service
public class DepartmentService {
@Autowired
private DepartmentRepository departmentRepository;

public List<Department> getDepartments() {
	return departmentRepository.findAll();
}

public void addDepartment(Department department) {
	// The save method of JpaRepository works for both insert and update operations.
    for(Employee employee : department.getEmployees()) {
    	employee.setDepartment(department); // Set the department for each employee
		// Set the department for each employee
	}
	departmentRepository.save(department);
 }
}
