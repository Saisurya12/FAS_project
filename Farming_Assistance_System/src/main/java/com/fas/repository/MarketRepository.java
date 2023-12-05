package com.fas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fas.entity.Market;

public interface MarketRepository extends JpaRepository<Market, Integer> {

}
