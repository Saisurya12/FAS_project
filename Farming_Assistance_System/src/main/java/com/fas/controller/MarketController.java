package com.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.fas.dao.MarketDao;
import com.fas.entity.Crop;
import com.fas.entity.Market;



@RestController
public class MarketController {
	@Autowired
	private MarketDao marketDao;



}
