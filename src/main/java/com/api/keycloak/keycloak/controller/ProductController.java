package com.api.keycloak.keycloak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.keycloak.keycloak.dto.ResponseDTO;
import com.api.keycloak.keycloak.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	private final ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/")
	@PreAuthorize("hasRole('USER') or hasRole('ADM')")
	public ResponseEntity<ResponseDTO> list() {

		return new ResponseEntity<>(productService.list(), HttpStatus.OK);
	}

	@PostMapping("/")
	@PreAuthorize("hasRole('ADM')")
	public ResponseEntity<ResponseDTO> create() {
		return new ResponseEntity<>(productService.create(), HttpStatus.CREATED);
	}

}