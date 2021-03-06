package com.los.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Loan")
@NamedQuery(name = "select all loans", query = "select c from Loan c")

public class Loan {
	
	@Id
	private int loanId;
	@Column(name="BRWRFIRSTNAME")
	private String brwrFname;
	@Column(name="BRWRLASTNAME")
	private String brwrLname;
	private String processorName;
	private String status;
	public Loan()
	{
		
	}
	
	


	public Loan(int loanId, String brwrFname, String brwrLname, 
			String processorName, String status) {
		this.loanId = loanId;
		this.brwrFname = brwrFname;
		this.brwrLname = brwrLname;
		this.processorName = processorName;
		this.status = status;
	}




	public int getLoanId() {
		return loanId;
	}


	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}


	public String getBrwrFname() {
		return brwrFname;
	}


	public void setBrwrFname(String brwrFname) {
		this.brwrFname = brwrFname;
	}


	public String getBrwrLname() {
		return brwrLname;
	}


	public void setBrwrLname(String brwrLname) {
		this.brwrLname = brwrLname;
	}






	public String getProcessorName() {
		return processorName;
	}




	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
