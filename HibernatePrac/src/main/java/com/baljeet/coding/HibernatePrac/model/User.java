package com.baljeet.coding.HibernatePrac.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name="USER_DETAILS")
@Table(name="USERDETAILS")
public class User { 
	@Id @GeneratedValue
	@Column(name="userid")
	private int id;
	@Column(name="username")
	private String name;
	@ElementCollection
	private Set<Address> listofAddress=new HashSet<Address>();
	
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



	public Set<Address> getListofAddress() {
		return listofAddress;
	}


	public void setListofAddress(Set<Address> listofAddress) {
		this.listofAddress = listofAddress;
	}
	


}
