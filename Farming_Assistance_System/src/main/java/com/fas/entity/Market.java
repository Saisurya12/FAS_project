package com.fas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "markets")
public class Market {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mandiId;
	private String mandiName;
	private String location;
	private String openTime;
	private String closeTime;
	public int getMandiId() {
		return mandiId;
	}
	public void setMandiId(int mandiId) {
		this.mandiId = mandiId;
	}
	public String getMandiName() {
		return mandiName;
	}
	public void setMandiName(String mandiName) {
		this.mandiName = mandiName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	
   
}
