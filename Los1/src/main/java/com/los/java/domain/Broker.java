package com.los.java.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Broker")
@SequenceGenerator(name="brokerIdGenerator", sequenceName="bId", allocationSize=1)
@NamedQuery(name = "select all broker", query = "select c from Broker c")
public class Broker {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="brokerIdGenerator")
	private int bId;
	private String bFirstName;
	private String bLastName;
	private String bAddress;
	private String bCity;
	private String bState;
	private String bZip;
	private String bUserName;
	private String bPassword;

	public Broker(String bFirstName, String bLastName, String bAddress,
			String bCity, String bState, String bZip, String bUserName,
			String bPassword) {
		super();
		this.bFirstName = bFirstName;
		this.bLastName = bLastName;
		this.bAddress = bAddress;
		this.bCity = bCity;
		this.bState = bState;
		this.bZip = bZip;
		this.bUserName = bUserName;
		this.bPassword = bPassword;
	}

	public Broker() {
		// TODO Auto-generated constructor stub
	}

	public String getbFirstName() {
		return bFirstName;
	}

	public void setbFirstName(String bFirstName) {
		this.bFirstName = bFirstName;
	}

	public String getbLastName() {
		return bLastName;
	}

	public void setbLastName(String bLastName) {
		this.bLastName = bLastName;
	}

	public String getbAddress() {
		return bAddress;
	}

	public void setbAddress(String bAddress) {
		this.bAddress = bAddress;
	}

	public String getbCity() {
		return bCity;
	}

	public void setbCity(String bCity) {
		this.bCity = bCity;
	}

	public String getbState() {
		return bState;
	}

	public void setbState(String bState) {
		this.bState = bState;
	}

	public String getbZip() {
		return bZip;
	}

	public void setbZip(String bZip) {
		this.bZip = bZip;
	}

	public String getbUserName() {
		return bUserName;
	}

	public void setbUserName(String bUserName) {
		this.bUserName = bUserName;
	}

	public String getbPassword() {
		return bPassword;
	}

	public void setbPassword(String bPassword) {
		this.bPassword = bPassword;
	}

	@Override
	public String toString() {
		return "Broker [bFirstName=" + bFirstName + ", bLastName=" + bLastName
				+ ", bAddress=" + bAddress + ", bCity=" + bCity + ", bState="
				+ bState + ", bZip=" + bZip + ", bUserName=" + bUserName
				+ ", bPassword=" + bPassword + "]";
	}

}
