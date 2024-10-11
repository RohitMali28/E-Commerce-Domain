package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.*;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	@Query(value="select * from employee e where city=?1", nativeQuery =true)
	List<Employee> findByCity(String city);
}
