package com.jsp.sac;

import java.util.List;
import java.util.Map;

public class Person 
{
	private int id;
	private String name;
	private int age;
	private String gender;
	private Map<String,String> map;
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	private  List<Long> phno;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<Long> getPhno() {
		return phno;
	}
	public void setPhno(List<Long> phno) {
		this.phno = phno;
	}
	
	

}
