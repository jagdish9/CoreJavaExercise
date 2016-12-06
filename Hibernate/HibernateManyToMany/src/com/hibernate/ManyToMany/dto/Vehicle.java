package com.hibernate.ManyToMany.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name="WH_Vehicle")
public class Vehicle {

	@Id @GeneratedValue
	private int vehicleId;
	private String vehicleName;
	
	@ManyToMany (mappedBy="vehicle") // after specifying mapped by we told hibernate that 
	                                // it is mapped by some other class then its mapping 
	                               //not required, mapping done in one table instead of 2 tables
	private Collection<UserDetails> userList = new ArrayList<UserDetails>();
	
	public Collection<UserDetails> getUserList() {
		return userList;
	}
	public void setUserList(Collection<UserDetails> userList) {
		this.userList = userList;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	
}
