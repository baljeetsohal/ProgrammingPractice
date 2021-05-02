package com.baljeet.coding.HibernatePrac.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name="USER_DETAILS")
public class User { 
	@Id
	@Column(name="userid")
	private int id;
	@Column(name="username")
	private String name;
	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	@Transient
	private String address;
	
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	private String description;
	
	
	
	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User(){
		
	}
	public User(int id, String name, Date joinedDate, String address, String description) {
		super();
		this.id = id;
		this.name = name;
		this.joinedDate = joinedDate;
		this.address = address;
		this.description = description;
	}


}
