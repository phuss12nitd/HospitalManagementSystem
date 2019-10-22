package com.phuss.admissionsservicems.model;

import java.util.List;

public class EmployeesList {

	private List<Employee> listEmployee;

	public EmployeesList(List<Employee> listEmployee) {
		super();
		this.listEmployee = listEmployee;
	}

	public List<Employee> getListEmployee() {
		return listEmployee;
	}

	public void setListEmployee(List<Employee> listEmployee) {
		this.listEmployee = listEmployee;
	}

	public EmployeesList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
