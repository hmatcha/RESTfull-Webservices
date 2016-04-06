package com.los.java.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Borrower")
@NamedQuery(name = "select all borrowers", query = "select c from Borrower c")
public class Borrower {

	// Borrower Info

	@Id
	private int brwrId;
	private String brwrFirstName;
	private String brwrLastName;
	private String brwrAddress;
	private String brwrCity;
	private String brwrState;
	private String brwrZip;
//	private String brwrUserName;
//	private String brwrPassword;

	// Co-Borrower Info
	private String cbrwrFirstName;
	private String cbrwrLastName;
	private String cbrwrAddress;
	private String cbrwrCity;
	private String cbrwrState;
	private String cbrwrZip;

	public Borrower()
	{
		
	}
	
	public Borrower(String brwrFirstName, String brwrLastName,
			String brwrAddress, String brwrCity, String brwrState,
			String brwrZip, String brwrUserName, String brwrPassword,
			String cbrwrFirstName, String cbrwrLastName, String cbrwrAddress,
			String cbrwrCity, String cbrwrState, String cbrwrZip) {
		super();
		this.brwrFirstName = brwrFirstName;
		this.brwrLastName = brwrLastName;
		this.brwrAddress = brwrAddress;
		this.brwrCity = brwrCity;
		this.brwrState = brwrState;
		this.brwrZip = brwrZip;
//		this.brwrUserName = brwrUserName;
//		this.brwrPassword = brwrPassword;
		this.cbrwrFirstName = cbrwrFirstName;
		this.cbrwrLastName = cbrwrLastName;
		this.cbrwrAddress = cbrwrAddress;
		this.cbrwrCity = cbrwrCity;
		this.cbrwrState = cbrwrState;
		this.cbrwrZip = cbrwrZip;
	}

	public String getBrwrFirstName() {
		return brwrFirstName;
	}

	public void setBrwrFirstName(String brwrFirstName) {
		this.brwrFirstName = brwrFirstName;
	}

	public String getBrwrLastName() {
		return brwrLastName;
	}

	public void setBrwrLastName(String brwrLastName) {
		this.brwrLastName = brwrLastName;
	}

	public String getBrwrAddress() {
		return brwrAddress;
	}

	public void setBrwrAddress(String brwrAddress) {
		this.brwrAddress = brwrAddress;
	}

	public String getBrwrCity() {
		return brwrCity;
	}

	public void setBrwrCity(String brwrCity) {
		this.brwrCity = brwrCity;
	}

	public String getBrwrState() {
		return brwrState;
	}

	public void setBrwrState(String brwrState) {
		this.brwrState = brwrState;
	}

	public String getBrwrZip() {
		return brwrZip;
	}

	public void setBrwrZip(String brwrZip) {
		this.brwrZip = brwrZip;
	}

//	public String getBrwrUserName() {
//		return brwrUserName;
//	}
//
//	public void setBrwrUserName(String brwrUserName) {
//		this.brwrUserName = brwrUserName;
//	}
//
//	public String getBrwrPassword() {
//		return brwrPassword;
//	}
//
//	public void setBrwrPassword(String brwrPassword) {
//		this.brwrPassword = brwrPassword;
//	}

	public String getCbrwrFirstName() {
		return cbrwrFirstName;
	}

	public void setCbrwrFirstName(String cbrwrFirstName) {
		this.cbrwrFirstName = cbrwrFirstName;
	}

	public String getCbrwrLastName() {
		return cbrwrLastName;
	}

	public void setCbrwrLastName(String cbrwrLastName) {
		this.cbrwrLastName = cbrwrLastName;
	}

	public String getCbrwrAddress() {
		return cbrwrAddress;
	}

	public void setCbrwrAddress(String cbrwrAddress) {
		this.cbrwrAddress = cbrwrAddress;
	}

	public String getCbrwrCity() {
		return cbrwrCity;
	}

	public void setCbrwrCity(String cbrwrCity) {
		this.cbrwrCity = cbrwrCity;
	}

	public String getCbrwrState() {
		return cbrwrState;
	}

	public void setCbrwrState(String cbrwrState) {
		this.cbrwrState = cbrwrState;
	}

	public String getCbrwrZip() {
		return cbrwrZip;
	}

	public void setCbrwrZip(String cbrwrZip) {
		this.cbrwrZip = cbrwrZip;
	}

}
