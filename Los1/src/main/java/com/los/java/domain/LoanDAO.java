package com.los.java.domain;

import java.util.List;

public interface LoanDAO {

	public List<Loan> showAllLoans();

	public void addLoan(Loan loan);

}
