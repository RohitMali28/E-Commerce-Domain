package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.*;
import com.example.demo.entity.*;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	//create a object of logger
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	//Save Operation
	@PostMapping("/save")  // http://localhost:8080/employee/save
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		logger.info("Inside save Employee method");
		Employee emp = employeeService.saveEmployee(employee);  // method calling
		logger.info("Service Call of save employee is successful");
		return ResponseEntity.ok().body(emp);
	}
	
	
	//Get Employee by Id
	@GetMapping("/get/{id}")  // http://localhost:8080/get/4
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id) {
		Employee employee = employeeService.getEmployeeById(id);
		return ResponseEntity.ok().body(employee);
	}
	
	// Delete Employee by id
	@DeleteMapping("/delete/{id}")  //http://localhost:8080/delete/4
	public void deleteEmployeeById(@PathVariable("id") Integer id) throws Exception {
		employeeService.deleteEmployee(id);
	}
	
	//To get the List of employee by city
	@GetMapping("/getcity/{city}")  // http://localhost:8080/getcity/mumbai
	public ResponseEntity<List<Employee>> getEmployeeByCity(@PathVariable("city") String city) {
		List<Employee> employee = employeeService.getListByCity(city);
		return ResponseEntity.ok().body(employee);
	}



}
