package com.los.java.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BrokerServiceImpl {

	@Autowired
	private BrokerDAO dao;

	public List<Broker> displayBrokers() {
		
		return dao.showAllBrokers();
	}

	public void insertBroker(Broker broker) {
		dao.addBroker(broker);
	}
	
	public Broker retrieveBroker(String username, String password)
	{
		return dao.getBroker(username, password);
	}
}
