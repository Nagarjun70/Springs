package com.jsp.onetomany;

import java.util.Map;

public class Student 
{
	private int id;
	private String name;
	private int age;
	private Map<String,Double>SubjectMarks;
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
	public Map<String, Double> getSubjectMarks() {
		return SubjectMarks;
	}
	public void setSubjectMarks(Map<String, Double> subjectMarks) {
		SubjectMarks = subjectMarks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", SubjectMarks=" + SubjectMarks + "]";
	}
	
	

}
