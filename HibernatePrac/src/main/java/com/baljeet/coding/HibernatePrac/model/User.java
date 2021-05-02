package com.baljeet.coding.HibernatePrac.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name="USER_DETAILS")
public class User { 
	@Id @GeneratedValue
	@Column(name="userid")
	private int id;
	@Column(name="username")
	private String name;
	@Embedded
	private Address address;
	
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


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	


}
