package com.hibernate.collections.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="WHUser_Details_Aaval")
public class WHUserDetailsAaval {

	@Id @GeneratedValue (strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	
	@ElementCollection
	private Set<Address> listAddress = new HashSet<Address>();
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Set<Address> getListAddress() {
		return listAddress;
	}
	public void setListAddress(Set<Address> listAddress) {
		this.listAddress = listAddress;
	}
	
}
