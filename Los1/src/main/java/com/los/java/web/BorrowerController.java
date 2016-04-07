package com.los.java.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.los.java.domain.Borrower;
import com.los.java.domain.BorrowerServiceImpl;

@Controller
public class BorrowerController {
	@Autowired
	private BorrowerServiceImpl service;

	@RequestMapping("/borrower")
	@ResponseBody
	List<Borrower> getBorrowersFromDataBase() {
		List<Borrower> borrowers = service.displayBorrowers();
		return borrowers;
	}

	@RequestMapping(value = "/saveBorrowers", method = RequestMethod.POST)
	@ResponseBody
	public void saveBorrower(@RequestBody Borrower borrower) {
		service.insertBorrowers(borrower);
		System.out.println("Save done");
	}
}
