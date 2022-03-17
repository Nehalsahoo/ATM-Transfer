package com.cg.atm.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address_ms")
public class ATMDTO {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String transactionId;
	private String name;
	private String phoneNo;
	private String accountNo;
	private String amount;
	
	
	public ATMDTO(String transactionId, String name, String phoneNo, String accountNo, String amount) {
		super();
		this.transactionId = transactionId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.accountNo = accountNo;
		this.amount = amount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}



	public ATMDTO() {}
		
}
