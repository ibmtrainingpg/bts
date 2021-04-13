package com.ibm.employee.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ibm.employee.entity.Employee;
import com.ibm.employee.repo.EmployeeRepository;

class EmployeeServiceTest {
	EmployeeService employeeService;
	EmployeeRepository dummyRepo;
	Employee employee;

	@BeforeEach
	void init() {
		employeeService = new EmployeeService();
		dummyRepo = new DummyEmployeeRepository();
		employeeService.setEmployeeRepository(dummyRepo);
		employee = new Employee();
	}

	/**
	 * method to test the createEmployee method
	 */
	@Test
	void testCreateBug() {
		String employeeId = employeeService.createEmployee(employee);
		assertNotNull(employeeId);
	}

	/**
	 * method to test the getEmployees method
	 */
	@Test
	void testGetBugs() {
		List<Employee> employeeList = employeeService.getEmployees();
		assertNotNull(employeeList);
		assertEquals("23dfgh567i", employeeList.get(0).getId());
	}

	/**
	 * method to test the getEmployee method
	 */
	@Test
	void testGetBugById() {
		Optional<Employee> employee1 = employeeService.getEmployee("23dfgh567i");
		assertNotNull(employee1);
	}

}
