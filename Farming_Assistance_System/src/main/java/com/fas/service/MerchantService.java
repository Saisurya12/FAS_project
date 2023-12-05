package com.fas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fas.dao.MerchantDao;
import com.fas.repository.MerchantRepository;

@Service
public class MerchantService implements MerchantDao{
    @Autowired
	private MerchantRepository merchantRepository;
}
