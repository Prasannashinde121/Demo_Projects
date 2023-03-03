package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	@Qualifier("address")
	private Address address;
	private Address address1;

	public Address getAddress1() {
		return address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		System.out.println("Setting Values");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}


	
}
