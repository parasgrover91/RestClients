package com.rest;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class RestTemplateWithFieldValidator extends RestTemplate{

	@Override
	public <T> ResponseEntity<T> postForEntity(String url, Object request, Class<T> responseType,
			Map<String, ?> uriVariables) throws RestClientException {
	
		
		return super.postForEntity(url, request, responseType, uriVariables);
	}
}
