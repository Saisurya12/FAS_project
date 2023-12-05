package com.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.fas.dao.MerchantDao;
import com.fas.repository.MerchantRepository;

@RestController
public class MerchantController {
	@Autowired
	private MerchantDao merchantDao;

}
