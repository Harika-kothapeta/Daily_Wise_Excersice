package com.main.model;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Physician {
	@Id
private String id;
	@NotEmpty
    @Size(min=6,max=15)
private String fname;
	@NotEmpty
    @Size(min=6,max=15)
private String lname;
	@NotEmpty
private String dept;
	@NotEmpty
private String Education;
	@NotNull
private Integer experience;
	@NotEmpty
private String state;
	@NotEmpty
private String insuranceplan;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getEducation() {
	return Education;
}
public void setEducation(String education) {
	Education = education;
}
public Integer getExperience() {
	return experience;
}
public void setExperience(Integer experience) {
	this.experience = experience;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getInsuranceplan() {
	return insuranceplan;
}
public void setInsuranceplan(String insuranceplan) {
	this.insuranceplan = insuranceplan;
}

}
