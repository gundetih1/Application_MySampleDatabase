package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
	List<Orders> findByCustomer_CustomerNumber(Integer CustomerNumber);
	List<Orders> findByorderNumber(Integer orderNumber);
	List<Orders> findByCustomer_CustomerNumberAndOrderNumber(Integer CustomerNumber, Integer orderNumber);
}
