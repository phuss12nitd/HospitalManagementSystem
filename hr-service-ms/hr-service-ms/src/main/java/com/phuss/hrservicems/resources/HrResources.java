package com.phuss.hrservicems.resources;

import java.util.Arrays;
import java.util.List;

import com.phuss.hrservicems.model.Employee;
import com.phuss.hrservicems.model.EmployeesList;

@RequestController
@RequestMapping("/hr")
public class HrResources {

	
	List<Employee> employees = Arrays.asList(
			new Employee("E101", "Medha", "Morgan", "Bone"),
			new Employee("E102", "Samriddhi", "Sharma", "Dental"),
			new Employee("E103", "Rakesh", "Kohli", "Nerves"),
			new Employee("E104", "Arindam", "Shaw", "Mind")
			);
	
	@RequestMapping("/employee")
	public EmployeesList getEmployee()
	{
		EmployeesList employeeList = new EmployeesList();
		employeeList.setListEmployee(employees);
		return employeeList;		
	}
	
	@RequestMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") String id)
	{
		for(Employee emp:employees)
		{
			if(emp.getId() == id)
				return emp;
		}
	}
}
