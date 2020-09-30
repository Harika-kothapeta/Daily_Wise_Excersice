package com.pack.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	@NotNull
	@Size(min=2,max=5)
private Integer id;
	@NotEmpty
private String name;
	@NotEmpty
	@Min(value=3)
	@Max(value=5)
private String password;
	@NotEmpty
	@Email
private String email;
	@NotEmpty
private String gender;
	@NotEmpty
private String mode;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getMode() {
	return mode;
}
public void setMode(String mode) {
	this.mode = mode;
}


}
