package com.phuss.admissionsservicems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdmissionsServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmissionsServiceMsApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate;
	}

}
