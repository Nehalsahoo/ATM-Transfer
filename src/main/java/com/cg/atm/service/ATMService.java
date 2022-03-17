package com.cg.atm.service;

import java.util.List;

import com.cg.atm.dto.ATMDTO;


public interface ATMService {
	
	 /*
     * viewAllTransaction
     * descriptio:shows all Transaction
     */
	List<ATMDTO> viewAllTransaction();
	
	/*
	 * name - addTransaction
	 * description - It will add an Transactions to the database
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	boolean addAddress(ATMDTO address);
	/*
	 * name - updateaddress
	 * description - it will update the available address
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	boolean updateAddress(ATMDTO address);
	
	/*
	 * name - deleteaddress
	 * description - it will delete available address
	 */
	boolean deleteAddress(String addressId);
	
}
