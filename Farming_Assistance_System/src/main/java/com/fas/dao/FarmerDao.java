package com.fas.dao;

import com.fas.dto.FarmerDto;
import com.fas.entity.Farmer;

public interface FarmerDao {

	FarmerDto addFarmer(FarmerDto farmer);
	
	public String updateFarmer(FarmerDto farmer);
	
	

}
