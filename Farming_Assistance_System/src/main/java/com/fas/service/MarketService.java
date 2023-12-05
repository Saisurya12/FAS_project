package com.fas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fas.dao.MarketDao;
import com.fas.entity.Market;
import com.fas.repository.MarketRepository;
@Service
public class MarketService  implements MarketDao {
	@Autowired
	private MarketRepository marketRepository;

	@Override
	public Market addMarket(Market market) {
		
		return marketRepository.save(market);
	}

}
