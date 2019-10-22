package com.phuss.admissionsservicems.model;

public class Patient {

	
	private String id;
	private String name;
	private String nationality;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String id, String name, String nationality) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
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
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
}
