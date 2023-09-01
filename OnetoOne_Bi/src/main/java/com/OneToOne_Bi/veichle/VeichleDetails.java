package com.OneToOne_Bi.veichle;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VeichleDetails {
	
	@Id
	private String veichleNo;
	private String brandName;
	private int modelNo;
	private String engineCC;
	
	private UserDetails ud;

	public String getVeichleNo() {
		return veichleNo;
	}

	public void setVeichleNo(String veichleNo) {
		this.veichleNo = veichleNo;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getEngineCC() {
		return engineCC;
	}

	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}

	public UserDetails getUd() {
		return ud;
	}

	public void setUd(UserDetails ud) {
		this.ud = ud;
	}

	
	// we should not over ride to string method for any one of the class ,here im not overided for the userdetailClass
	@Override
	public String toString() {
		return "VeichleDetails [veichleNo=" + veichleNo + ", brandName=" + brandName + ", modelNo=" + modelNo
				+ ", engineCC=" + engineCC + "]";
	}
	
	
}
