package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Entitypoc;

public interface demorepo extends CrudRepository<Entitypoc,String> {
	
	@Query("FROM Entitypoc")
    public List<Entitypoc> getAll();
}
