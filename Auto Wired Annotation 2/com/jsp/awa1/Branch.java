package com.jsp.awa1;

public class Branch
{
	private int bid;
	private String name;
	private String location;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", name=" + name + ", location=" + location + "]";
	}



}
