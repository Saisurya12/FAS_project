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
@Table(name = "merchants")
public class Merchant extends User{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int merchantId;
	private String firmName;
	private String email;
	private String contactNo;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="marketMerchant" ,joinColumns = { @JoinColumn(name = "merchantId") }, 
    inverseJoinColumns = { @JoinColumn(name = "mandiId") })
	private List<Market> market;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="marketCrop" ,joinColumns = { @JoinColumn(name = "merchantId") }, 
    inverseJoinColumns = { @JoinColumn(name = "cropId") })
	private List<Crop> crop;
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public String getFirmName() {
		return firmName;
	}
	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
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
