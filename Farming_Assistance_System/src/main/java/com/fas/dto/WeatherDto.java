package com.fas.dto;

import com.fas.entity.Crop;

public class WeatherDto {
	
	private int id;
	private String weatherName;
	private String location;
	private Crop suggestedCrop;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWeatherName() {
		return weatherName;
	}
	public void setWeatherName(String weatherName) {
		this.weatherName = weatherName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Crop getSuggestedCrop() {
		return suggestedCrop;
	}
	public void setSuggestedCrop(Crop suggestedCrop) {
		this.suggestedCrop = suggestedCrop;
	}
	
	


}
