package com.cognizant.status;

public class EmployeeStatus {
	private String id;
	private String name;
	private String gender;
	private String date;
	private String fullTime;
	public EmployeeStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeStatus(String id, String name, String gender, String date, String fullTime) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.date = date;
		this.fullTime = fullTime;
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
	public String getFullTime() {
		return fullTime;
	}
	public void setFullTime(String fullTime) {
		this.fullTime = fullTime;
	}
	

}
