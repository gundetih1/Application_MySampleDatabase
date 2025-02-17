package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Integer>{

}
