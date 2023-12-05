package com.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.fas.dao.PestDao;

@RestController
public class PestController {
	@Autowired
	private PestDao pestDao;

}
