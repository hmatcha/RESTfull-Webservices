package com.los.java.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.los.java.domain.Loan;
import com.los.java.domain.LoanServiceImpl;

@Controller
public class LoanController 
{
	@Autowired
	private LoanServiceImpl service;
	
	@RequestMapping("/loans")
	@ResponseBody
	List<Loan> getLoansJson()
	{
		List<Loan> loans =service.displayLoans();
		
		return loans;
		
	}

}
