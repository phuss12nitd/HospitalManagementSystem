package com.phuss.admissionsservicems.model;

import java.util.List;

public class DiseasesList {

	private List<Disease> diseaseList;

	public DiseasesList(List<Disease> diseaseList) {
		super();
		this.diseaseList = diseaseList;
	}

	public DiseasesList() {
		super();
	}

	public List<Disease> getDiseaseList() {
		return diseaseList;
	}

	public void setDiseaseList(List<Disease> diseaseList) {
		this.diseaseList = diseaseList;
	}
	
	
}
