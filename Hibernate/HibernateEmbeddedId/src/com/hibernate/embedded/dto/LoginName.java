package com.hibernate.embedded.dto;

import java.io.Serializable;

import javax.persistence.Column;

public class LoginName implements Serializable {

	@Column (name="EMP_ID")
	private int empId;
	
	@Column (name="EMAIL_ID")
	private String emailId;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
