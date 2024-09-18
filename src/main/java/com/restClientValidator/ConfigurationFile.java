package com.restClientValidator;

import com.rest.ModelUrlMapper;
import com.rest.RestClientConfiguration;

@RestClientConfiguration
public class ConfigurationFile {


	@ModelUrlMapper
	public Object returnRequiredClass(String url){
		if(url.equalsIgnoreCase("http://localhost:8080/modifyPersons")) {
			return A[].class;
		}
		if(url.equalsIgnoreCase("http://localhost:8080/modifyEmployee")) {
			return B.class;
		}
		return null;
	}
}
