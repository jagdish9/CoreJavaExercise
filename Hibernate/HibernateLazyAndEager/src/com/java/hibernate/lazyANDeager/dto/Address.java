package com.java.hibernate.lazyANDeager.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Address {

	@Column (name="STREET_NAME")
	private String street;
	
	@Column (name="CITY_NAME")
	private String city;
	
	@Column (name="STATE_NAME")
	private String state;
	
	@Column (name="PIN_CODE")
	private String pincode;
	
	@Column (name="RECORD_TIME")
	@Temporal (TemporalType.DATE)
	private Date date;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
