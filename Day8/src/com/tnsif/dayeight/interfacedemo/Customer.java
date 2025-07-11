package com.tnsif.dayeight.interfacedemo;

public class Customer {
	
	private String city;
	
	private String name;
	
	
	// getter and setter

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(String city, String name) {
		super();
		this.city = city;
		this.name = name;
	}

	public Customer() {
		super();
	}
	
	
	
	

}
