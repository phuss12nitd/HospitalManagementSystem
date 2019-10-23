package com.phuss.admissionsservicems.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.phuss.admissionsservicems.model.DiseasesList;
import com.phuss.admissionsservicems.model.EmployeesList;
import com.phuss.admissionsservicems.model.Patient;

@RestController
@RequestMapping("/admissions")
public class AdmissionsResource {

	@Autowired
	private RestTemplate restTemplate;
	
	List<Patient> patients = Arrays.asList(
			new Patient("P1", "Piyush", "Indian"),
			new Patient("P2", "Atul", "Pakistan"),
			new Patient("P3", "Vanpriya", "Bangladesh"),
			new Patient("P4", "Melonica", "London"),
			new Patient("P5", "Faiz", "New York")
			);
	
	@RequestMapping("/patients")
	public List<Patient> getPatients()
	{
		return patients;
	}
	
	@RequestMapping("/patients/{id}")
	public Patient getPatientById(@PathVariable("id") String id)
	{
		Patient patient1= new Patient();
		for(Patient patient : patients)
		{
			if(patient.getId().equals(id))
				patient1 = patient;
		}
		return patient1;
	}

	@RequestMapping("/physicians")
	public EmployeesList getPhysicians()
	{
		
		return restTemplate.getForObject("http://localhost:8082/hr/employee", EmployeesList.class);
	}

	@RequestMapping("/diseases")
	public DiseasesList getDiseases()
	{
		
		return restTemplate.getForObject("http://localhost:8083/pathology/disease", DiseasesList.class);
	}
	
}
