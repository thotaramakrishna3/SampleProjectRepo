package com.trainings.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



//@Entity
//@Table
public class Courses {
	@Id
	@SequenceGenerator(name = "Courses" , sequenceName = "CoursesSequence", allocationSize = 1)
	@GeneratedValue(generator = "Courses", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private Date createdDate;
	private Date updatedDate;		
	private String approvedStatus;
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
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getApprovedStatus() {
		return approvedStatus;
	}
	public void setApprovedStatus(String approvedStatus) {
		this.approvedStatus = approvedStatus;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ ", approvedStatus=" + approvedStatus + "]";
	}
	public Courses(Long id, String name, Date createdDate, Date updatedDate, String approvedStatus) {
		super();
		this.id = id;
		this.name = name;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.approvedStatus = approvedStatus;
	}
	public Courses() {
		super();
	}
	
}
