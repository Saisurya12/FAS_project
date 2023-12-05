package com.fas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fas.entity.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer, Integer> {

}
