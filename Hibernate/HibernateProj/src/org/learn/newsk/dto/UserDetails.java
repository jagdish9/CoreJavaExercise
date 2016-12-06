package org.learn.newsk.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity (name="USER_DETAILS")
@Entity
@Table (name="USER_DETAILS")
public class UserDetails {
    @Id
    //@Column (name="USER_ID")
	private int userId;
    //@Column (name="USER_NAME")
    //@Transient
	private String userName;
	
	@Temporal (TemporalType.DATE) // by default it uses timestamp
	private Date joinedDate;
	
	private String address;
	
	@Lob
	private String description;
	
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
	
	
}
