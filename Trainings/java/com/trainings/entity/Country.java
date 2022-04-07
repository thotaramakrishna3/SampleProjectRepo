package com.trainings.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


//@Entity
//@Table
public class Country {
	@Id
	@SequenceGenerator(name = "Country" , sequenceName = "CountrySequence", allocationSize = 1)
	@GeneratedValue(generator = "Country", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private List<State> state;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<State> getState() {
		return state;
	}
	public void setState(List<State> state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", state=" + state + "]";
	}
	public Country(Long id, String name, List<State> state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
	}
	public Country() {
		super();
	}
	
}
