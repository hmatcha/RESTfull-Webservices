package com.los.java.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class BrokerDAOJPAImpl implements BrokerDAO {

	@PersistenceContext
	private EntityManager em;
	@Override
	public List<Broker> showAllBrokers() {
		Query query = em.createNamedQuery("select all broker");
		return (List<Broker>) query.getResultList();
	}
	@Override
	@Transactional
	public void addBroker(Broker broker) {
		em.persist(broker);
	}
	@Override
	public Broker getBroker(String bUserName, String bPassword) {
		
		Query query =  em.createQuery("from Broker where bUserName  = :username and bPassword = :password");
		query.setParameter("username", bUserName);
		query.setParameter("password", bPassword);
		
		
		return (Broker)query.getSingleResult();
	}

}
