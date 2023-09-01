package org.team.Game;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teams {
	
	@Id
	private int idNo;
	private String name;
	private String captian;
	private String color;
	private String game;
	
	
	
	
	
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCaptian() {
		return captian;
	}
	public void setCaptian(String captian) {
		this.captian = captian;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	@Override
	public String toString() {
		return "Teams [idNo=" + idNo + ", name=" + name + ", captian=" + captian + ", color=" + color + ", game=" + game
				+ "]";
	}
	
	
	
	
	
}
