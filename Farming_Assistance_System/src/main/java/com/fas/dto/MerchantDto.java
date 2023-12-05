package com.fas.dto;

import com.fas.entity.Crop;
import com.fas.entity.Market;

public class MerchantDto extends UserDto{
	
	private int merchantId;
	private String firmName;
	private String email;
	private String contactNo;
	private Market market;
	private Crop crop;
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
	public Market getMarket() {
		return market;
	}
	public void setMarket(Market market) {
		this.market = market;
	}
	public Crop getCrop() {
		return crop;
	}
	public void setCrop(Crop crop) {
		this.crop = crop;
	}
	
	
	

}
