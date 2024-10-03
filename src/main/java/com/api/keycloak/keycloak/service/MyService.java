package com.api.keycloak.keycloak.service;

import org.springframework.stereotype.Service;

import com.api.keycloak.keycloak.dto.Response;

@Service
public class MyService {

	public Response publicEndpoint() {
		Response response = new Response();
		response.setMessage("Este endpoint é público!");
		return response;
	}

	public Response privateEndpoint() {
		Response response = new Response();
		response.setMessage("Este endpoint é protegido!");
		return response;
	}
}
