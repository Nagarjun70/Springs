package com.jsp.awa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	@Autowired
	@Qualifier("myaddress2")
	private Address address;
	public Person(Address address) {
		
		this.address = address;
		System.out.println("class done in constuctor");
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address getAddress() {
		return address;
	}
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("class done in setproperty");
	}
	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}
}