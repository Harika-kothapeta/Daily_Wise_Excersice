package com.main.model;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Patient {
	@Id
	private Integer id;
	@NotEmpty
    @Size(min=6,max=15)
	private String fname;
	@NotEmpty
    @Size(min=6,max=15)
	private String lname;
	@NotEmpty
	private String password;
	@NotNull
	@Past(message="Enter a valid date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dob;
	@NotEmpty
	@Email
	private String email;
	 @NotNull
	private Integer contact_number;
    @NotEmpty
	private String state;
    @NotEmpty
	private String insurance_plan;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getContact_number() {
		return contact_number;
	}

	public void setContact_number(Integer contact_number) {
		this.contact_number = contact_number;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getInsurance_plan() {
		return insurance_plan;
	}

	public void setInsurance_plan(String insurance_plan) {
		this.insurance_plan = insurance_plan;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}