package com.los.java.domain;

import java.util.List;

public interface BorrowerDAO {

	public List<Borrower> showBorrowers();

	public void addBorrower(Borrower borrower);

}
