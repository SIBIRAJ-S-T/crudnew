package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.NewEntity;

@Repository
public interface NewRepo extends JpaRepository<NewEntity, Integer>{
	NewEntity findById(int Id);
	
	List<NewEntity> deleteByDesignation(String designation);
}
