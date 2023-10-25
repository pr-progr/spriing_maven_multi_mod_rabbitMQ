package com.example.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class UserModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String userId;
	String userName;
	
	public UserModel() {
		// TODO Auto-generated constructor stub
	}
	
	public UserModel(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	
	
	

}
