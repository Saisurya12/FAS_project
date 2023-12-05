package com.fas.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fas.dao.FarmerDao;
import com.fas.dto.FarmerDto;
import com.fas.entity.Farmer;
import com.fas.repository.FarmerRepository;
@Service
public class FarmerService implements FarmerDao{
	@Autowired
	private FarmerRepository farmerRepository;
	@Autowired
	private ModelMapper modelMapper;
   
	
	
	public FarmerDto mapToDto(Farmer farmer)
	{
		return modelMapper.map(farmer, FarmerDto.class);
	}
	
	public Farmer mapToEntity(FarmerDto farmer)
	{
		return modelMapper.map(farmer, Farmer.class);
	}
	
	public FarmerDto addFarmer(FarmerDto farmer) {
		farmerRepository.save(mapToEntity(farmer));
		farmer.setFarmerId(mapToEntity(farmer).getFarmerId());
		return farmer;
	}

	@Override
	public String updateFarmer(FarmerDto farmer) {
		Farmer far = mapToEntity(farmer);
		if(farmerRepository.existsById(far.getFarmerId()))
		{   
			farmer.setFarmerId(far.getFarmerId());
			far.setUserName(farmer.getUserName());
			far.setPassword(farmer.getPassword());
			far.setRole(farmer.getRole());
			far.setFarmerName(farmer.getFarmerName());
			far.setLocation(farmer.getLocation());
			far.setCrop(farmer.getCrop());
			far.setMarket(farmer.getMarket());
			far.setContactNumber(farmer.getContactNumber());
			farmerRepository.save(far);
			return "Record Updated";
		}
		return "Record is not found";
		
	}

}
