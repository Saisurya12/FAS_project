package com.fas.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity

public class Weather {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String weatherName;
	private String location;
	
	@OneToMany(cascade = CascadeType.ALL,targetEntity = Crop.class)
	@JoinColumn(name="wId",referencedColumnName = "id")
	private List<Crop> suggestedCrop;

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

	public List<Crop> getSuggestedCrop() {
		return suggestedCrop;
	}

	public void setSuggestedCrop(List<Crop> suggestedCrop) {
		this.suggestedCrop = suggestedCrop;
	}

	

}
