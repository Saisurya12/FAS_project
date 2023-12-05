package com.fas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fas.dao.WeatherDao;
import com.fas.repository.WeatherRepository;
@Service
public class WeatherService implements WeatherDao {
   
	@Autowired
	private WeatherRepository weatherRepository;
}
