package com.los.java.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class BorrowerDAOJPAImpl implements BorrowerDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Borrower> showBorrowers() {
		Query query = em.createNamedQuery("select all borrowers");

		return (List<Borrower>) query.getResultList();
	}
	@Override
	@Transactional
	public void addBorrower(Borrower borrower) {
		em.persist(borrower);

	}

}
