package com.cognizant.date;

public class EmployeeDate {
	private String id;
	private String name;
	private String gender;
	private String date;
	public EmployeeDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDate(String id, String name, String gender,String date) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
}
}