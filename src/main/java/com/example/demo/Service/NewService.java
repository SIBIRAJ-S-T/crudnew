package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.NewEntity;
import com.example.demo.Repo.NewRepo;

@Service
public class NewService {
	
	@Autowired
	NewRepo empRepo;
	public List<NewEntity> insertData(List<NewEntity> empList) {
		// TODO Auto-generated method stub
		return empRepo.saveAll(empList);
	}
	public List<NewEntity> getEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}
	public NewEntity getEmployeeById(int Id) {
		// TODO Auto-generated method stub
		return empRepo.findById(Id);
	}
	public List<NewEntity> delEmpByDeg(String designation) {
		// TODO Auto-generated method stub
		return empRepo.deleteByDesignation(designation);
	}
}
