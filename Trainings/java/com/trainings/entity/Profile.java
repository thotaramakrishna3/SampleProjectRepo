package com.trainings.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


//@Entity
//@Table
public class Profile {
	@Id
	@SequenceGenerator(name = "Profile" , sequenceName = "ProfileSequence", allocationSize = 1)
	@GeneratedValue(generator = "Profile", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private boolean create;
	private boolean update;
	private boolean delete;
	private boolean view;
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
	public boolean isCreate() {
		return create;
	}
	public void setCreate(boolean create) {
		this.create = create;
	}
	public boolean isUpdate() {
		return update;
	}
	public void setUpdate(boolean update) {
		this.update = update;
	}
	public boolean isDelete() {
		return delete;
	}
	public void setDelete(boolean delete) {
		this.delete = delete;
	}
	public boolean isView() {
		return view;
	}
	public void setView(boolean view) {
		this.view = view;
	}
	@Override
	public String toString() {
		return "Profile [id=" + id + ", name=" + name + ", create=" + create + ", update=" + update + ", delete="
				+ delete + ", view=" + view + "]";
	}
	public Profile(Long id, String name, boolean create, boolean update, boolean delete, boolean view) {
		super();
		this.id = id;
		this.name = name;
		this.create = create;
		this.update = update;
		this.delete = delete;
		this.view = view;
	}
	public Profile() {
		super();
	}
	
}
