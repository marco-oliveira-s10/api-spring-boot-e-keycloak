package com.api.keycloak.keycloak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.keycloak.keycloak.dto.Response;
import com.api.keycloak.keycloak.service.MyService;

@RestController
@RequestMapping("/api")
public class MyController {

	private final MyService myService;

	@Autowired
	public MyController(MyService myService) {
		this.myService = myService;
	}

	@GetMapping("/public")
	public ResponseEntity<Response> publicEndpoint() {
		return new ResponseEntity<>(myService.publicEndpoint(), HttpStatus.OK);
	}

	@GetMapping("/private")
	public ResponseEntity<Response> privateEndpoint() {
		return new ResponseEntity<>(myService.privateEndpoint(), HttpStatus.OK);
	}
}
