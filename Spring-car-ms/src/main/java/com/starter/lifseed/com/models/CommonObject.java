package com.starter.lifseed.com.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

//This is a super class. an abstract class, only used to inherit other classes.

@MappedSuperclass // tells spring that this obj is note an entity
//this helps to avoid infinite recursion.
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CommonObject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private String details;

	// Constructor
	public CommonObject() {

	}

	// Constructor with fields
	public CommonObject(Integer id, String description, String details) {

		this.id = id;
		this.description = description;
		this.details = details;
	}

	// Setters and getters generated.
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "CommonObject [id=" + id + ", description=" + description + ", details=" + details + "]";
	}

}
