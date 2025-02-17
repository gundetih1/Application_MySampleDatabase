package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Employees;
@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

}
