package com.example.demo.db.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.db.model.Cuisine;

@Repository
public class CuisineDalImpl implements CuisineDal{
	
	
	@Autowired
	private MongoTemplate db;

	@Override
	public List<Cuisine> findAll() {
		return db.findAll(Cuisine.class);
	}

	@Override
	public Cuisine create(Cuisine c) {
		return db.save(c);
	}

	@Override
	public Cuisine findByName(String name) {
		Query q = new Query();
		q.addCriteria(Criteria.where("name").is(name));
		return db.findOne(q, Cuisine.class);
	}

	@Override
	public Cuisine findByNameAndType(String name, String type) {
		// TODO Auto-generated method stub
		Query q = new Query();
		q.addCriteria(Criteria.where("name").is(name).and("type").is(type));
		return db.findOne(q, Cuisine.class);
	}

}
