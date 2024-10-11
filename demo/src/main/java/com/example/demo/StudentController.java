package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")

public class StudentController {

	@GetMapping("/getdata")
	public String getTest() {
		return "Student data";
}
	
    @GetMapping("/getlist")
     public List<String> getStudentData(){
    	List<String> list = new ArrayList<String>();
    	list.add("Ram");
    	list.add("10");
    	list.add("pune");
    	return list;
    }
	
    @GetMapping("/getStudent")
    public Student getStudentDetails() {
    	Student student = new Student();
    	return student;
    }
}
