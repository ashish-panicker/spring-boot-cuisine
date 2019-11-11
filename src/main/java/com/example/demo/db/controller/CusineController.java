package com.example.demo.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.model.Cuisine;
import com.example.demo.db.repo.CuisineDal;

@RestController
public class CusineController {
	
	@Autowired
	private CuisineDal dal;
	
	@PostMapping("/cuisines")
	private Cuisine create(@RequestBody Cuisine c) {
		return dal.create(c);
	}
	
	@GetMapping("/cuisines")
	private List<Cuisine> findAll(){
		return dal.findAll();
	}
	
	@GetMapping("/cuisines/{name}")
	private Cuisine findByName(@PathVariable String name) {
		return dal.findByName(name);
	}
	
	@GetMapping("/cuisines/{name}/{type}")
	private Cuisine findByNameAndType(@PathVariable String name, @PathVariable String type) {
		return dal.findByNameAndType(name, type);
	}

}
