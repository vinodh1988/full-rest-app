package com.rest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
@Id
  private Integer eno;
@Column 
  private String name;
@Column
  private String role;
@ManyToOne
@JoinColumn(name="dno")
@JsonIgnore
  private Department department;
  public Employee() {
  }
  public Employee(Integer eno, String name, String role) {
	  	this.eno = eno;
	this.name = name;
	this.role = role;
  }
public Integer getEno() {
	return eno;
}
public void setEno(Integer eno) {
	this.eno = eno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
  

}
