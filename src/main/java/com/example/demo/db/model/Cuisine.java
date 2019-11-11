package com.example.demo.db.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("cuisines")
public class Cuisine {

	@Id
	private String id;
	private String name;
	private String type;

	public Cuisine() {
		// TODO Auto-generated constructor stub
	}

	public Cuisine(String id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
