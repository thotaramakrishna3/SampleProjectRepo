package com.trainings.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


//@Entity
//@Table
public class State {
	@Id
	@SequenceGenerator(name = "State" , sequenceName = "StateSequence", allocationSize = 1)
	@GeneratedValue(generator = "State", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
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
	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + "]";
	}
	public State(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public State() {
		super();
	}
	
}
