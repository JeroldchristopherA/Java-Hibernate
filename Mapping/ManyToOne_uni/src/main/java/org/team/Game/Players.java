package org.team.Game;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Players {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int jerseyNo;
	private String role;
	
	
	@ManyToOne
	private Teams team;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getJerseyNo() {
		return jerseyNo;
	}


	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public Teams getTeam() {
		return team;
	}


	public void setTeam(Teams team) {
		this.team = team;
	}


	@Override
	public String toString() {
		return "Players [id=" + id + ", name=" + name + ", jerseyNo=" + jerseyNo + ", role=" + role + ", team=" + team
				+ "]";
	}



	
}
