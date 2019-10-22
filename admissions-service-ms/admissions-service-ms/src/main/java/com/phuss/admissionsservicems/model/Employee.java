package com.phuss.admissionsservicems.model;

public class Employee {

	private String id;
	private String fname;
	private String lname;
	private String speciality;
	public Employee(String id, String fname, String lname, String speciality) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.speciality = speciality;
	}
	public Employee() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	
	

	
	
}
