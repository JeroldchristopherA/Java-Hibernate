package com.OneToOne_Bi.veichle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regNo;
	private String name;
	private int dob;
	private String panNo;
	private int age;
	
	@OneToOne
	private VeichleDetails vd;


	public int getRegNo() {
		return regNo;
	}


	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDob() {
		return dob;
	}


	public void setDob(int dob) {
		this.dob = dob;
	}


	public String getPanNo() {
		return panNo;
	}


	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public VeichleDetails getVd() {
		return vd;
	}


	public void setVd(VeichleDetails vd) {
		this.vd = vd;
	}


	@Override
	public String toString() {
		return "UserDetails [regNo=" + regNo + ", name=" + name + ", dob=" + dob + ", panNo=" + panNo + ", age=" + age
				+ ", vd=" + vd + "]";
	}
	
	
	
}
