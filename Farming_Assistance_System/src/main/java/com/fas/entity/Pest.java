package com.fas.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "pestsides")
public class Pest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Pestid;
	private String pesticideName;
	private String description;
	private String price;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="PestCrop" ,joinColumns = { @JoinColumn(name = "pest_id") }, 
    inverseJoinColumns = { @JoinColumn(name = "crop_id") })
	private List<Crop> crop;
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
	public List<Crop> getCrop() {
		return crop;
	}
	public void setCrop(List<Crop> crop) {
		this.crop = crop;
	}
	
	

}
