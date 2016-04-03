package com.los.java.domain;

import java.util.List;

public interface BrokerDAO {

	public List<Broker> showAllBrokers();

	public void addBroker(Broker broker);
	
	public Broker getBroker(String username, String password);

}
