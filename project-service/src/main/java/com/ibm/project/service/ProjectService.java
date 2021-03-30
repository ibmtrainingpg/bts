package com.ibm.project.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.project.entity.Project;
import com.ibm.project.repo.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	ProjectRepository projectRepository;

	public void updateProject(@Valid Project project) {
		projectRepository.save(project);
		
		
	}

}
