package com.ibm.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.employee.entity.Employee;
import com.ibm.employee.repo.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	/**
	 * service method to get details of the specific employee
	 * @param employeeId
	 * @return zero or matching employee details
	 */
	public Optional<Employee> getEmployee(String employeeId) {
		return employeeRepository.findById(employeeId);
	}
	
	/**
	 * service method to return the details of all the employees
	 * @return all employees
	 */

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
}
