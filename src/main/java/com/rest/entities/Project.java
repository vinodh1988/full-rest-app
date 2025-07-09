package com.rest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "projects")
public class Project {
@Id
private Integer pno;
@Column
private String name;
@Column
private String technology;
@Column
private Integer teamsize;

public Project() {}
public Project(Integer pno, String name, String technology, Integer teamsize) {
	this.pno = pno;
	this.name = name;
	this.technology = technology;
	this.teamsize = teamsize;
}
public Integer getPno() {
	return pno;
}
public void setPno(Integer pno) {
	this.pno = pno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTechnology() {
	return technology;
}
public void setTechnology(String technology) {
	this.technology = technology;
}
public Integer getTeamsize() {
	return teamsize;
}
public void setTeamsize(Integer teamSize) {
	this.teamsize = teamSize;
}


}
