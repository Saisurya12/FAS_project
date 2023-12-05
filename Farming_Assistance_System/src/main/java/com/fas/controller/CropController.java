package com.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fas.dao.CropDao;
import com.fas.entity.Crop;

@RestController
public class CropController {
	@Autowired
	private CropDao cropDao;
    @PostMapping("/saveCrop")
	public Crop saveCropRecord(@RequestBody Crop crop) {
		
		return cropDao.addCrop(crop);
	}
	
	

}
