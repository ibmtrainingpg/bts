package com.ibm.bug.entity;
import java.util.Date;

//import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

import com.ibm.bug.PRIORITY;
import com.ibm.bug.STATUS;

public class Bug {
	@NotNull
	PRIORITY priority;
	@NotNull 
	STATUS status;
	@NotNull
	@Size(min=10, max=200, message = "Please Describe in less than 200 characters and not less than 10.")
	private String title;
	@Id
	private String id;
	@NotNull
	private String type;
	private String projectId;
	@Size(min=10, max=1000, message = "Please Describe in less than 1000 characters and not less than 10.")
	private String description;
	private String product;
	private Date sumbitOn;
	
	public PRIORITY getPriority() {
		return priority;
	}
	public void setPriority(PRIORITY priority) {
		this.priority = priority;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Date getSumbitOn() {
		return sumbitOn;
	}
	public void setSumbitOn(Date sumbitOn) {
		this.sumbitOn = sumbitOn;
	}


	
	

}
