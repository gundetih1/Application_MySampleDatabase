package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employees;
import com.example.demo.Service.EmployeesService;

@RestController
@RequestMapping("/api")
public class EmployeesController {
	
	@Autowired
	public EmployeesService employeesService;
	
	@GetMapping("/employees")
	public List<Employees> getAllEmployees(){
		return employeesService.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employees getEmployeeById(@PathVariable Integer id) {
		return employeesService.getEmployeeById(id);
	}
	
	@RequestMapping("/createemployees")
	public List<Employees> createEmployees(@RequestBody List<Employees> employees){
		return employeesService.saveEmployees(employees);
	}
	
	

}
