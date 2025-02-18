package com.example.demo.Entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customers {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerNumber", updatable = false, nullable = false)
	private Integer customerNumber;

	
	@Column(name = "customerName", nullable = false, length = 50)
	private String customerName;
	
	@Column(name = "contactLastName", nullable = false, length = 50)
	private String contactLastName;
	
	@Column(name = "contactFirstName", nullable = false, length = 50)
	private String contactFirstName;
	
	@Column(name = "phone", nullable = false, length = 50)
	private String phone;
	
	@Column(name = "addressLine1", nullable = false, length = 50)
	private String addressLine1;
	
	@Column(name = "addressLine2", length = 50)
	private String addressLine2;
	
	@Column(name = "city", nullable = false, length = 50)
	private String city;
	
	@Column(name = "state", nullable = false, length = 50)
	private String state;
	
	@Column(name = "postalCode", nullable = false, length = 15)
	private String postalCode;
	
	@Column(name = "country", nullable = false, length = 50)
	private String country;
	

	@ManyToOne
	@JoinColumn(name = "salesRepEmployeeNumber", referencedColumnName = "employeeNumber")
	private Employees salesRep;
	
	//@Column(name = "salesRepEmployeeNumber")
	//private Integer salesRepEmployeeNumber;
	
	@Column(name = "creditLimit", precision = 10, scale = 2)
	private BigDecimal creditLimit;
	
	
	
	public Customers() {}



	public Customers(Integer customerNumber, String customerName, String contactLastName, String contactFirstName,
			String phone, String addressLine1, String addressLine2, String city, String state, String postalCode,
			String country, Employees salesRep, BigDecimal creditLimit) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.contactLastName = contactLastName;
		this.contactFirstName = contactFirstName;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.salesRep = salesRep;
		this.creditLimit = creditLimit;
	}



	public Integer getCustomerNumber() {
		return customerNumber;
	}



	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getContactLastName() {
		return contactLastName;
	}



	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}



	public String getContactFirstName() {
		return contactFirstName;
	}



	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getAddressLine1() {
		return addressLine1;
	}



	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}



	public String getAddressLine2() {
		return addressLine2;
	}



	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getPostalCode() {
		return postalCode;
	}



	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public Employees getSalesRep() {
		return salesRep;
	}



	public void setSalesRep(Employees salesRep) {
		this.salesRep = salesRep;
	}



	public BigDecimal getCreditLimit() {
		return creditLimit;
	}



	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	
	
	
}
