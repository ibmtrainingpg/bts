package com.ibm.employee.entity;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import com.ibm.employee.ROLE;

public class Employee {
	@Id
	private String id;
	@NotNull
	private String name;
	@NotNull
	private String email;
	@NotNull
	private int mobileNumber;
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
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public ROLE getRole() {
		return role;
	}
	public void setRole(ROLE role) {
		this.role = role;
	}
	
	
}
