package com.fas.dto;

import com.fas.entity.Crop;

public class PestDto {
	
	private int Pestid;
	private String pesticideName;
	private String description;
	private String price;
	private Crop crop;
	public int getPestid() {
		return Pestid;
	}
	public void setPestid(int pestid) {
		Pestid = pestid;
	}
	public String getPesticideName() {
		return pesticideName;
	}
	public void setPesticideName(String pesticideName) {
		this.pesticideName = pesticideName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Crop getCrop() {
		return crop;
	}
	public void setCrop(Crop crop) {
		this.crop = crop;
	} 
	
	

}
