package com.fas.dto;

public class CropDto {
	
	private int cropId;
	private String cropName;
	private double quantity;
	private double salePrice;
	private double buyPrice;
	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
   
	

}
