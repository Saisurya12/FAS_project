package com.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.fas.dao.WeatherDao;

@RestController
public class WeatherController {
	@Autowired
	private WeatherDao weatherDao;

}
