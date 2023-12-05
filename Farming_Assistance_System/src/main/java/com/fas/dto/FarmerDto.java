package com.fas.dto;

import java.util.List;

import com.fas.entity.Crop;
import com.fas.entity.Market;

public class FarmerDto extends UserDto {
  
	private int farmerId;
	private String farmerName;
	private String location;
	private String contactNumber;
	private List<Market> market;
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
