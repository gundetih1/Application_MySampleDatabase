package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customers;
import com.example.demo.Service.CustomersService;

@RestController
@RequestMapping("/api")
public class CustomersController {
	
	@Autowired
	public CustomersService customersService;
	
	@GetMapping("/customers")
	public List<Customers> getAllCustomers(){
		return customersService.getAllCustomers();
	}
	
	@GetMapping("/customer/{id}")
	public Customers getCustomerById(@PathVariable int id) {
		return customersService.getCustomerById(id);
	}
}
