package com.ibm.project.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ibm.project.entity.Project;
import com.ibm.project.repo.ProjectRepository;

class ProjectServiceTest {
	
	ProjectService projectService;
	ProjectRepository dummyRepo;
	Project project;

	@BeforeEach
	void init() {
		projectService = new ProjectService();
		dummyRepo = new DummyProjectRepository();
		projectService.setProjectRepository(dummyRepo);
		project = new Project();
	}
	
	
	/**
	 * method to test the getProject method 
	 */
	@Test
	void testGetProject() {
		Optional<Project> project1 = projectService.getProject("2345sdfri");
		assertNotNull(project1);
	}

	/**
	 * method to test the getProjects method
	 */
	@Test
	void testGetProjects() {
		List<Project> projectList = projectService.getProjects();
		assertNotNull(projectList);
		assertEquals("2345sdfri", projectList.get(0).getId());
	}

	/**
	 * method to test the createProject method
	 */
	@Test
	void testCreateProject() {
		String projectId = projectService.createProject(project);
		assertNotNull(projectId);
	}

}
