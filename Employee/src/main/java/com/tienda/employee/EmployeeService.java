package com.tienda.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> findAll(){
		return repository.findAll();
	}
	
	public Employee save(Employee employee){
		return repository.save(employee);
	}
}
