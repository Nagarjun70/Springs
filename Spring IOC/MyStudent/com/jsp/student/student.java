package com.jsp.student;

public class student 
{
	private int id;
	private String name;
	private int age;
	private String gender;
	private long phno;
	private double marks;
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", phno=" + phno
				+ ", marks=" + marks + "]";
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	

}

