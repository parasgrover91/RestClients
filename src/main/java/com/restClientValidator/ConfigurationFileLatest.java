package com.restClientValidator;

import com.rest.DBField;

public class ConfigurationFileLatest {

	@DBField(name="http://localhost:8080/modifyPersons", type=String.class, methodType="GET")
	String url1;
	
	@DBField(name="http://localhost:8080/modifyPersons", type=String.class, methodType="POST")
	String url2;
	
	@DBField(name="http://localhost:8080/modifyPersons", type=String.class, methodType="GET")
	String url3;
	
	@DBField(name="http://localhost:8080/modifyPersons", type=String.class, methodType="GET")
	String url4;
	
}
