package com.fas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fas.dao.CropDao;
import com.fas.entity.Crop;
import com.fas.repository.CropRepository;
@Service
public class CropService implements CropDao{
	@Autowired
	private CropRepository cropRepository;

	@Override
	public Crop addCrop(Crop crop) {
		
		return cropRepository.save(crop);
	}
	

}
