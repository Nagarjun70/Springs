package com.jsp.hospital;

import java.util.Map;

public class Hospital 
{
	
	private int id;
	private String name;
	private String website;
	private long phno;
	private Map<String,String> bnamelocation;
	
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public Map<String, String> getBnamelocation() {
		return bnamelocation;
	}
	public void setBnamelocation(Map<String, String> bnamelocation) {
		this.bnamelocation = bnamelocation;
	}
}