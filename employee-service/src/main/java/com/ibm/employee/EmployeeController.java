package com.ibm.employee;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;

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



	/**
	 * 
	 * @param employee
	 * @param bindingResult
	 * @return creates employee
	 */
	@PostMapping("/employee")
	@ResponseStatus(code = HttpStatus.CREATED)
	String createBug(@RequestBody @Valid Employee employee, BindingResult bindingResult) {
		validateModel(bindingResult);
		System.out.println(employee);
		return employeeService.createEmployee(employee);
	}
	
	
	
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
