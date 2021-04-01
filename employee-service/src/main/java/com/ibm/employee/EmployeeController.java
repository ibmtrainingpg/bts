package com.ibm.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.employee.entity.Employee;
import com.ibm.employee.service.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	/**
	 * method to get details of all the employees
	 * @return employees details 
	 */
	@GetMapping("/employee")
	List<Employee> getEmployees() {
		return employeeService.getEmployees();

	}
	
	/**
	 * method to get details of specific employee
	 * @param employeeId
	 * @return zero or matching employee 
	 */
	
	@GetMapping("/employee/{id}")
	Optional<Employee> getBug(@PathVariable("id") String employeeId) {
		return employeeService.getEmployee(employeeId);
	}

	
}
