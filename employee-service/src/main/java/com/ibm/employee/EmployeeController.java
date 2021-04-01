package com.ibm.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.employee.service.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
}
