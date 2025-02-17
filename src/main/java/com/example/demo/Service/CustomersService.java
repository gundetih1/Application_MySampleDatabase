package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customers;
import com.example.demo.Repository.CustomersRepository;

@Service
public class CustomersService {
	
	@Autowired
	public CustomersRepository customersRepository;
	
	public List<Customers> getAllCustomers(){
		//return customersRepository.findAll();
		 List<Customers> customers = customersRepository.findAll();
		    
		    for (Customers c : customers) {
		        System.out.println("Fetched Customer ID: " + c.getCustomerNumber());
		    }
		    return customers;
	}
	
	public Customers getCustomerById(int id) {
		Optional<Customers> customer = customersRepository.findById(id);
		return customer.orElse(null);
	}
}
