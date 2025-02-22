package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Orders;
import com.example.demo.Repository.OrdersRepository;

@Service
public class OrdersService {
	@Autowired
	public OrdersRepository ordersRepository;
	
	public List<Orders> getAllOrders(){
		return ordersRepository.findAll();
	}
	
	public List<Orders> getAllOrdersByCustomerNumber(int CustomerNumber){
		return ordersRepository.findByCustomer_CustomerNumber(CustomerNumber);
	}
	
	public List<Orders> getOrdersByOrderNumber(int orderNumber){
		return ordersRepository.findByorderNumber(orderNumber);
	}
	
	public List<Orders> getOrderByCustomerNumberAndorderNumber(Integer CustomerNumber, Integer orderNumber){
		return ordersRepository.findByCustomer_CustomerNumberAndOrderNumber(CustomerNumber, orderNumber);
	}
}
