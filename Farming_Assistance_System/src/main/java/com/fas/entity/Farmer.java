package com.fas.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="farmers")
public class Farmer extends User{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int farmerId;
	private String farmerName;
	private String location;
	private String contactNumber;
	
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="farmerMarket" ,joinColumns = { @JoinColumn(name = "farmer_id") }, 
	        inverseJoinColumns = { @JoinColumn(name = "market_id") })
	private List<Market> market;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="farmerCrop" ,joinColumns = { @JoinColumn(name = "farmer_id") }, 
    inverseJoinColumns = { @JoinColumn(name = "crop_id") })
	private List<Crop> crop;
	public int getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public List<Market> getMarket() {
		return market;
	}
	public void setMarket(List<Market> market) {
		this.market = market;
	}
	public List<Crop> getCrop() {
		return crop;
	}
	public void setCrop(List<Crop> crop) {
		this.crop = crop;
	}
	
	

}
