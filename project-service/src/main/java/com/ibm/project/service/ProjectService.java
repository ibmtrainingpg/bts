package com.ibm.project.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.project.entity.Project;
import com.ibm.project.repo.ProjectRepository;

@Service
@Transactional
public class ProjectService {
	@Autowired
	ProjectRepository projectRepository;


	public void updateProject(@Valid Project project) {
		projectRepository.save(project);
	}

	public Optional<Project> getProject(String projectId) {
		return projectRepository.findById(projectId);
	}

	public List<Project> getProjects() {
		return projectRepository.findAll();
	}

	public String createProject(Project project) {
		Project savedBug=projectRepository.save(project);
		return project.getId();
	}

}
