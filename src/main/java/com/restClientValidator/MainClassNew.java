package com.restClientValidator;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.rest.DBField;

public class MainClassNew {

	 public static void main(String[] args) throws Exception { 
	        System.out.println("Java Custom Annotation Example"); 
	        System.out.println(); 
	  
	        ConfigurationFileLatest usr = new ConfigurationFileLatest(); 
	    
	        Map< String, Class< ?>> urlClassTypeMapping = new HashMap<>();
	        Map< String, String> urlMethodTypeMapping = new HashMap<>();
	        
    for (Field field : usr.getClass().getDeclaredFields()) { 
    	DBField dbField = field.getAnnotation(DBField.class); 
        urlClassTypeMapping.put(dbField.name(),dbField.type());
        urlMethodTypeMapping.put(dbField.name(),dbField.methodType());
        
        
    } 
	 }
}
