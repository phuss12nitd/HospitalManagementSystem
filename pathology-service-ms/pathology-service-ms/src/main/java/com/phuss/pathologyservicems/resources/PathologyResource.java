package com.phuss.pathologyservicems.resources;

import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import com.phuss.pathologyservicems.model.Disease;
import com.phuss.pathologyservicems.model.DiseasesList;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {

	
	List<Disease> diseases = Arrays.asList(
			new Disease("D01","Asthama","Warm Water"),
			new Disease("D02","Snowphilia","Tablets"),
			new Disease("D03","Obesity","Yoga"),
			new Disease("D04","Vernicular","R45")
			
			);
	
	@Autowired
	private DiseasesList diseaseList;
	
	@RequestMapping("/disease")
	public DiseasesList getDisease()
	{
		DiseasesList diseasesList = new DiseasesList();
		diseasesList.setDiseaseList(diseases);
		return diseasesList;
		
	}
	
	
	@RequestMapping("/disease/{id}")
	public Disease getDiseaseById(@PathVariable("id") String id)
	{
		for(Disease disease: diseases)
		{
			if(disease.getId() == id)
				return disease;
		}
	}
}
