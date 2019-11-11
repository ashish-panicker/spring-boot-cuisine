package com.example.demo.db.repo;

import java.util.List;

import com.example.demo.db.model.Cuisine;

public interface CuisineDal {
	
	public List<Cuisine> findAll();
	
	public Cuisine create(Cuisine c);
	
	public Cuisine findByName(String name);
	
	public Cuisine findByNameAndType(String name, String type);

}
