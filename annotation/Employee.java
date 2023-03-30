package com.jsp.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="myEmployee")
public class Employee
{
	@Value(value="101")
	private int id;
	@Value(value="ARJUN")
	private String name;
	@Value(value ="25")
	private int age;
	@Value(value = "477777")
	private double sal;
	@Value(value = "SEE")
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
	
	

}
