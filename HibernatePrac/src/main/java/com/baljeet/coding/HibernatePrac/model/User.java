package com.baljeet.coding.HibernatePrac.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.mapping.Array;

@Entity(name="USER_DETAILS")
@Table(name="USERDETAILS")
public class User { 
	@Id @GeneratedValue
	@Column(name="userid")
	private int id;
	@Column(name="username")
	private String name;
	@ElementCollection
	@JoinTable(name="User_Address",joinColumns=@JoinColumn(name="User_id"))
	@GenericGenerator(name="increment-gen",strategy="increment")
	@CollectionId(columns = { @Column(name="Address_id") }, generator = "increment-gen", type = @Type( type = "long"))
	private Collection<Address> listofAddress=new ArrayList<Address>();
	
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


	public Collection<Address> getListofAddress() {
		return listofAddress;
	}


	public void setListofAddress(Collection<Address> listofAddress) {
		this.listofAddress = listofAddress;
	}





	
	


}
