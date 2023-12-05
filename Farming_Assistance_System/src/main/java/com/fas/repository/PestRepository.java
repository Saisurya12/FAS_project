package com.fas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fas.entity.Pest;

public interface PestRepository extends JpaRepository<Pest, Integer> {

}
