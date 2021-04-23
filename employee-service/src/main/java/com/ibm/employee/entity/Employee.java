package com.ibm.employee.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import com.ibm.employee.ROLE;

public class Employee {
	@Id
	private String id;
	@NotNull
	private String name;
	@NotNull
	@Email
	private String email;
	@NotNull
	@Min(1000000000)
	@Max(9999999999L)
	private long mobileNumber;
	@NotNull
	private ROLE role;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public ROLE getRole() {
		return role;
	}
	public void setRole(ROLE role) {
		this.role = role;
	}
	
	
}
