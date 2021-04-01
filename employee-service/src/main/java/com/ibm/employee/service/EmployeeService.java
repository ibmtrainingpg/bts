package com.ibm.employee.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.employee.entity.Employee;
import com.ibm.employee.repo.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public void updateEmployeeDetails(@Valid Employee employee) {
		employeeRepository.save(employee);
	}
}
