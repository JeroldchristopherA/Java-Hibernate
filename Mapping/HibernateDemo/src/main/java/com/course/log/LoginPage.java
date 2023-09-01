package com.course.log;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginPage {
	@Id	
	 String username;
	 String password;
	 String firstName;
	 String lastName;
	 
	 
	 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

  



}


