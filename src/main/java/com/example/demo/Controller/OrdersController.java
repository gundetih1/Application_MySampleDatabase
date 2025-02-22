package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Orders;
import com.example.demo.Service.OrdersService;

@RestController
@RequestMapping("/api")
public class OrdersController {
	
	@Autowired
	public OrdersService ordersService;
	
	@GetMapping("/orders")
	public List<Orders> getAllOrders(){
		return ordersService.getAllOrders();
	}
	
	@GetMapping("customer/orders/{CustomerNumber}")
	public List<Orders> getAllOrdersByCustomerNumber(@PathVariable int CustomerNumber){
		return ordersService.getAllOrdersByCustomerNumber(CustomerNumber);
	}
	
	@GetMapping("/order/{orderNumber}")
	public List<Orders> getOrderByOrderNumber(@PathVariable int orderNumber){
		return ordersService.getOrdersByOrderNumber(orderNumber);
	}
	
	@GetMapping("customer/{customerNumber}/order/{orderNumber}")
	public List<Orders> getOrderByCustomerNumberAndOrderNumber(@PathVariable int customerNumber, @PathVariable int orderNumber){
		return ordersService.getOrderByCustomerNumberAndorderNumber(customerNumber, orderNumber);
	}
}
