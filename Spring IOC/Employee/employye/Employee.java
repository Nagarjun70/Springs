package com.jsp.employye;

public class Employee 
{
	private int id;
	private String name;
	private int age;
	private double sal;
	private String job;

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSal() {
		return sal;
	}
	public String getJob() {
		return job;
	}
	public Employee(int id, String name, int age, double sal, String job) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.job = job;
	}
	
	

}
