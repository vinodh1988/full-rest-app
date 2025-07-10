package com.rest.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="departments")
public class Department {
@Id
  private Integer dno;
@Column
  private String name;
@OneToMany(mappedBy="department",cascade =CascadeType.ALL)
  private Set<Employee> employees;
  
  public Department() {
  }
  public Department(Integer dno, String name) {
	this.dno = dno;
	this.name = name;
  }
public Integer getDno() {
	return dno;
}
public void setDno(Integer dno) {
	this.dno = dno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<Employee> getEmployees() {
	return employees;
}
public void setEmployees(Set<Employee> employees) {
	this.employees = employees;
}
  

}
