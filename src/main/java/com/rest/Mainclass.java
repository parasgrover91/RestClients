package com.rest;

import java.lang.reflect.Method;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.restClientValidator.ConfigurationFile;

@RestClientValidator
public class Mainclass {

	public void getRestTemplateData() {
		RestTemplateWithFieldValidator restTemplate = new RestTemplateWithFieldValidator();
		ResponseEntity<Person[]> response = restTemplate.
				postForEntity("http://localhost:8080/modifyPersons", Person[].class, Person[].class);
		if(response.getStatusCode().equals(HttpStatus.OK)){
			returnEmployeeData(response.getBody());
		}
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void returnEmployeeData(Person[] personArray) {
		ConfigurationFile config=new ConfigurationFile();
		for(Method method:config.getClass().getDeclaredMethods()) {
			if(method.getDeclaredAnnotation(ModelUrlMapper.class) .equals(
					ModelUrlMapper.class)){
				
			}
		}
	}
}
