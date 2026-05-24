package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/employee")
	public String getEmployee() {
		return new Employee(1, "Sai").toString();
				
	}
}
