package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employees;
import com.example.demo.Repository.EmployeesRepository;

@Service
public class EmployeesService {
	
	@Autowired
	public EmployeesRepository employeesRepository;
	
	public List<Employees> getAllEmployees(){
		return employeesRepository.findAll();
	}
	
	public Employees getEmployeeById(int id) {
		Optional<Employees> employee = employeesRepository.findById(id);
		return employee. orElse(null);
	}

}	
