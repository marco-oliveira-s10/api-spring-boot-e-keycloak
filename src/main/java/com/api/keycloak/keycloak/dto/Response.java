package com.api.keycloak.keycloak.dto;

public class Response {

	private String message;

	public Response() {
		// Default constructor
	}

	public Response(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
