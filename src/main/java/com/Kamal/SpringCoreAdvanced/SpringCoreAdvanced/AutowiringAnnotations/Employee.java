package com.Kamal.SpringCoreAdvanced.SpringCoreAdvanced.AutowiringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	/*Autowired can be used on setters, on field levels, and also on constructors. 
	 * 
	 * setter is not required ,if  we are placing it on field level.
	 * */

	//@Autowired
	private Address address;

	@Autowired
	public Employee(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {

		return "Employee[Address: " + getAddress() + "]";
	}

	public Address getAddress() {
		return address;
	}

	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
}
