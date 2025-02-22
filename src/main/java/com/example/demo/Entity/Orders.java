package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
	
	@Id
	@Column(name="orderNumber", nullable = false,length=50)
	private Integer orderNumber;
	
	@Column(name="orderDate", nullable=false, length=11)
	private String orderDate;
	
	@Column(name="shippedDate",nullable=false,length=11)
	private String shippedDate;
	
	@Column(name="status",nullable=false,length=100)
	private String status;
	
	@ManyToOne
	@JoinColumn(name="customerNumber")
	@JsonIgnore
	private Customers customer;
	
	public Orders() {}

	public Orders(Integer orderNumber, String orderDate, String shippedDate, String status, Customers customer) {
		super();
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.shippedDate = shippedDate;
		this.status = status;
		this.customer = customer;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(String shippedDate) {
		this.shippedDate = shippedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	
	
	
}
