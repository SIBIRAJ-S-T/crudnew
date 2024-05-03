package com.example.demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.NewEntity;
import com.example.demo.Service.NewService;

import jakarta.transaction.Transactional;

@RestController
public class NewController {
	
	@Autowired
	NewService empService;
	
	@PostMapping("/insert")
	public List<NewEntity> insertEmp(@RequestBody List<NewEntity> empList) {
		return empService.insertData(empList);
		
	}
	
	@GetMapping("/view")
	public List<NewEntity> getEmp(){
		return empService.getEmployee();
	}
	
	@GetMapping("/view/{Id}")
	public NewEntity getEmpById(@PathVariable int Id) {
		return empService.getEmployeeById(Id);
		
	}
	
	@Transactional
	@DeleteMapping("/delete/{designation}")
	public List<NewEntity> delEmp(@PathVariable String designation){
		return empService.delEmpByDeg(designation);
	}

}
