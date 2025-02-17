package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "offices")
public class Offices {
	
	@Id
	@Column(name = "officeCode", nullable = false, length = 50)
	private Integer officeCode;
	
	@Column(name="city", nullable = false, length = 50)
	private String city;
	
	@Column(name="phone",nullable=false,length=10)
	private Integer phone;
	
	@Column(name="state",nullable=false,length=3)
	private String state;

}
