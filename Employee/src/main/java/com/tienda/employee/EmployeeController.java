package com.tienda.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleado")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/listar")
	public List<Employee> findAll(){
		return service.findAll();
	}
	
	@PostMapping("/guardar")
	public Employee save(@RequestBody Employee employee){
		return service.save(employee);
	}
	
}
