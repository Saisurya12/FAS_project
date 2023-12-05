package com.fas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fas.dao.CropDao;
import com.fas.dao.FarmerDao;
import com.fas.dao.MarketDao;
import com.fas.dto.FarmerDto;
import com.fas.entity.Crop;
import com.fas.entity.Farmer;
import com.fas.entity.Market;

@RestController
public class FarmerController {
	@Autowired
	private FarmerDao farmerDao;
	@Autowired
	private MarketDao md;
	@Autowired
	private CropDao cd;
	
	@PostMapping("/save")
	public FarmerDto saveRecord(@RequestBody FarmerDto farmer)
	{   
		   List<Crop> crop = farmer.getCrop();
		   for(Crop c:crop)
		   {
			   cd.addCrop(c);
		   }
		   
		return farmerDao.addFarmer(farmer);
	}
	
	@PutMapping("/update")
	public String UpdateFarmerDetails(FarmerDto farmer)
	{
		return farmerDao.updateFarmer(farmer);
	}

}
