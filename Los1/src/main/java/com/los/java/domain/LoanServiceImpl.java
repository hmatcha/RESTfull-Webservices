package com.los.java.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LoanServiceImpl {

	@Autowired
	private LoanDAO dao;

	public List<Loan> displayLoans() {
		return dao.showAllLoans();
	}

	public void insertLoan(Loan loan) {
		dao.addLoan(loan);
	}

}
