package com.ibm.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ibm.employee.ROLE;
import com.ibm.employee.entity.Employee;
import com.ibm.employee.repo.EmployeeRepository;

public class DummyEmployeeRepository implements EmployeeRepository {

	@Override
	public List<Employee> findAll() {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee = new Employee();
		Employee employee1 = new Employee();
		employee.setId("23dfgh567i");
		employees.add(employee);
		employee1.setId("24398t84gb32oi");
		employees.add(employee1);
		return employees ;
	}

	@Override
	public List<Employee> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> S insert(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Employee> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Employee arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Employee> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean existsById(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Employee> findAllById(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> findById(String employeeId) {
		Employee testEmployee = new Employee();
		testEmployee.setId(employeeId);
		return Optional.of(testEmployee);
	}

	@Override
	public Employee save(Employee employee) {
		employee.setId("23dfgh567i");
		employee.setName("Ram");
		employee.setRole(ROLE.DEVELOPER);
		return employee;
	}

	@Override
	public <S extends Employee> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Employee> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Employee> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
