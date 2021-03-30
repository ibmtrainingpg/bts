package com.ibm.project;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.project.entity.Project;
import com.ibm.project.service.ProjectService;

@RestController
public class ProjectController {
	@Autowired
	ProjectService projectService;
	
	
	@PutMapping("/project/{id}")
	void updateOrder(@RequestBody @Valid Project project, BindingResult bindingResult,@PathVariable("id") String projectId) {
		System.out.println(projectId);
		project.setId(projectId);
		projectService.updateProject(project);
		
	}
	
	
	

}
