package com.api.keycloak.keycloak.service;

import org.springframework.stereotype.Service;

import com.api.keycloak.keycloak.dto.ResponseDTO;

@Service
public class ProductService {

	public ResponseDTO list() {
		ResponseDTO response = new ResponseDTO();
		response.setMessage("Método visivel para role USER e ADM");
		return response;
	}

	public ResponseDTO create() {
		ResponseDTO response = new ResponseDTO();
		response.setMessage("Método visivel para role ADM");
		return response;
	}

}
