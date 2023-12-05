package com.fas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fas.entity.Crop;

public interface CropRepository extends JpaRepository<Crop, Integer> {

}
