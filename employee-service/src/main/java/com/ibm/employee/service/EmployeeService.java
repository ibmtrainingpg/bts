package com.ibm.employee.service;

import javax.validation.Valid;
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

	public void updateEmployeeDetails(@Valid Employee employee) {
		employeeRepository.save(employee);
	/**
	 * 
	 * @param employee
	 * @return employee id
	 */
	public String createEmployee(@Valid Employee employee) {
		Employee savedemployee=employeeRepository.save(employee);
		return employee.getId();

	public Optional<Employee> getEmployee(String employeeId) {
		return employeeRepository.findById(employeeId);
	}

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
}
