package com.fas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fas.entity.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Integer> {

}
