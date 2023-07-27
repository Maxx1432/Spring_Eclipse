package com.maxx.spring.model;

import jakarta.validation.constraints.Email;

public class Users {

	private int userID;
	private String name;
	@Email
	private String email;

	public Users() {


	}

	public Users(int userID, String name, String email) {

		this.userID = userID;
		this.name = name;
		this.email = email;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Users [userID=" + userID + ", name=" + name + ", email=" + email + "]";
	}
	
}
