package com.los.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Loan")
@SequenceGenerator(name="loanIdGenerator", sequenceName="loanId", allocationSize=1)
@NamedQuery(name = "select all loans", query = "select c from Loan c")

public class Loan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="loanIdGenerator")
	private int loanId;
	@Column(name="BRWRFIRSTNAME")
	private String brwrFname;
	@Column(name="BRWRLASTNAME")
	private String brwrLname;
	@Column(name="BFIRSTNAME")
	private String brkrFname; 
	@Column(name="BLASTNAME")
	private String brkrLname;
	private String processorName;
	private String status;
	public Loan()
	{
		
	}
	
	


	public Loan(int loanId, String brwrFname, String brwrLname, String brkrFname, String brkrLname,
			String processorName, String status) {
		this.loanId = loanId;
		this.brwrFname = brwrFname;
		this.brwrLname = brwrLname;
		this.brkrFname = brkrFname;
		this.brkrLname = brkrLname;
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


	public String getBrkrFname() {
		return brkrFname;
	}


	public void setBrkrFname(String brkrFname) {
		this.brkrFname = brkrFname;
	}


	public String getBrkrLname() {
		return brkrLname;
	}


	public void setBrkrLname(String brkrLname) {
		this.brkrLname = brkrLname;
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
