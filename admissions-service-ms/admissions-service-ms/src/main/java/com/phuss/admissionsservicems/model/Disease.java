package com.phuss.admissionsservicems.model;

public class Disease {
	
	private String id;
	private String name;
	private String treatment;
	public Disease(String id, String name, String treatment) {
		super();
		this.id = id;
		this.name = name;
		this.treatment = treatment;
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
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	
	

}
