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
public class Trainer {
	@Id
	@SequenceGenerator(name = "Trainer" , sequenceName = "TrainerSequence", allocationSize = 1)
	@GeneratedValue(generator = "Trainer", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private double courseFee;
	private Date createdDate;
	private Date updatedDate;
	private Date joinDate;
	private String email;
	private Long phone;
	private double discountPercentage;
	//@OneToOne
	private Country country;
	//@OneToOne
	private State state;
	private String approvedStatus;
	private boolean emailVerfied;
	//@OneToMany
	private Courses course;
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
	public double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
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
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public String getApprovedStatus() {
		return approvedStatus;
	}
	public void setApprovedStatus(String approvedStatus) {
		this.approvedStatus = approvedStatus;
	}
	public boolean isEmailVerfied() {
		return emailVerfied;
	}
	public void setEmailVerfied(boolean emailVerfied) {
		this.emailVerfied = emailVerfied;
	}
	public Courses getCourse() {
		return course;
	}
	public void setCourse(Courses course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", courseFee=" + courseFee + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", joinDate=" + joinDate + ", email=" + email + ", phone=" + phone
				+ ", discountPercentage=" + discountPercentage + ", country=" + country + ", state=" + state
				+ ", approvedStatus=" + approvedStatus + ", emailVerfied=" + emailVerfied + ", course=" + course + "]";
	}
	public Trainer(Long id, String name, double courseFee, Date createdDate, Date updatedDate, Date joinDate,
			String email, Long phone, double discountPercentage, Country country, State state, String approvedStatus,
			boolean emailVerfied, Courses course) {
		super();
		this.id = id;
		this.name = name;
		this.courseFee = courseFee;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.joinDate = joinDate;
		this.email = email;
		this.phone = phone;
		this.discountPercentage = discountPercentage;
		this.country = country;
		this.state = state;
		this.approvedStatus = approvedStatus;
		this.emailVerfied = emailVerfied;
		this.course = course;
	}
	public Trainer() {
		super();
	}
}
