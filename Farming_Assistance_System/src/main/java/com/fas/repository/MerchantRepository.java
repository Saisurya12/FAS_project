package com.fas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fas.entity.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Integer> {

}
