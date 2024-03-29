package com.phuss.hrservicems.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phuss.hrservicems.model.Employee;
import com.phuss.hrservicems.model.EmployeesList;

@RestController
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
		Employee employee1= new Employee();
		for(Employee emp:employees)
		{
			if(emp.getId().equals(id))
				employee1 = emp;
		}
		return employee1;
	}
}
