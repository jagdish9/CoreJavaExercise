package com.hibernate.addition.dto;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table (name="WHUser_Details")
public class UserDetails {

	@Id @GeneratedValue (strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	
	@ElementCollection
	@JoinTable (name="WHUSER_ADDRESS",   //to name the second table
	  joinColumns=@JoinColumn(name="USER_ID")
	)
	
	@GenericGenerator(name = "hilo-gen", strategy="hilo")
	@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type = "long"))
	private Collection<Address> listAddress = new ArrayList<Address>();
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public Collection<Address> getListAddress() {
		return listAddress;
	}
	public void setListAddress(Collection<Address> listAddress) {
		this.listAddress = listAddress;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
