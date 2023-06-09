package com.jsp.AWA;

public class Person 
{
	private int id;
	private String name;
	private String manager;
	private Address address;
	public Person(int id, String name, String manager, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.manager = manager;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", manager=" + manager + ", address=" + address + "]";
	}
	
	

}
