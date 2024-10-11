package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.*;

@Service
public interface EmployeeService {
	// save operation
	public Employee saveEmployee(Employee employee);
	
	// Get Employee by Id
	public Employee getEmployeeById(Integer Id);
	
	//Delete Employee
	public void deleteEmployee(Integer id);
	
	// Get Employee List by city
	public List<Employee> getListByCity(String city);

}
