package com.baljeet.coding.HibernatePrac.OnetoOneMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {
  @Id @GeneratedValue
  private int vehicleId;
  private String vehiclename;

public String getVehiclename() {
	return vehiclename;
}
public void setVehiclename(String vehiclename) {
	this.vehiclename = vehiclename;
}
public int getVehicleId() {
	return vehicleId;
}
public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
} 
}
