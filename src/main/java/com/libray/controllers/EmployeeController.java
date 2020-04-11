package com.libray.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.libray.models.Employee;
import com.libray.repositories.EmployeeRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping(value = "/employee")
@Api(value = "ProductsControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/employees")
	@ApiOperation(value = "View a list of available employees", response = List.class)
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public String createProduct() {
		return "Product is saved successfully";
	}

}
