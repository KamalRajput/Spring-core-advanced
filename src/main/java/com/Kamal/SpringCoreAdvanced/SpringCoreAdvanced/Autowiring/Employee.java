package com.Kamal.SpringCoreAdvanced.SpringCoreAdvanced.Autowiring;

public class Employee {

	private Address address;

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

	public void setAddress(Address address) {
		this.address = address;
	}
}
