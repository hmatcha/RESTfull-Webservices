package com.los.java.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class LoanDAOJPAImpl implements LoanDAO {

	@PersistenceContext
	private EntityManager em;
	@Override
	public List<Loan> showAllLoans() {
		Query query = em.createNamedQuery("select all loans");

		return (List<Loan>) query.getResultList();
	}
	@Override
	@Transactional
	public void addLoan(Loan loan) {
		em.persist(loan);
	}

}
