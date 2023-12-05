package com.fas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fas.dao.PestDao;
import com.fas.repository.PestRepository;

@Service
public class PestService implements PestDao {
	@Autowired
	private PestRepository pestRepository;

}
