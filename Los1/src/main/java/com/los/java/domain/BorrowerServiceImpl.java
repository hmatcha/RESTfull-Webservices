package com.los.java.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BorrowerServiceImpl {
	@Autowired
	private BorrowerDAO dao;

	public List<Borrower> displayBorrowers() {
		
		return dao.showBorrowers();

	}

	public void insertBorrowers(Borrower borrower) {
		dao.addBorrower(borrower);
	}
}
