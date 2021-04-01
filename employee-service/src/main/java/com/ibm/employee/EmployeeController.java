package com.ibm.employee;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.employee.entity.Employee;
import com.ibm.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	private void validateModel(Errors bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new IllegalArgumentException("Something went wrong.Please Retry!!");}
		}


	@PutMapping("/employee/{id}")
	void updateEmployeeDetails(@RequestBody @Valid Employee employee, BindingResult bindingResult,@PathVariable("id") String employeeId) {
		validateModel(bindingResult);
		System.out.println(employeeId);
		employee.setId(employeeId);
		employeeService.updateEmployeeDetails(employee);

	}

}
