package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.*;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// To save employee
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	// To retrieve the Employee by Id
	@Override
	public Employee getEmployeeById(Integer Id) {
	Employee employee=employeeRepository.findById(Id).get();// null
	return employee;
	}
	
	//To delete data
	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
	}
	
	//To retrieve data
	@Override
	public List<Employee> getListByCity(String city) {
	List<Employee> employee = employeeRepository.findByCity(city);
	return employee;
	}


}
