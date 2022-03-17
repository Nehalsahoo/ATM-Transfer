package com.cg.atm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.RecoverableDataAccessException;
import org.springframework.dao.TransientDataAccessException;
import org.springframework.stereotype.Service;

import com.cg.atm.dto.ATMDTO;
import com.cg.atm.exceptions.CrudException;
import com.cg.atm.repository.ATMRepository;


@Service
public class ATMServiceImpl implements ATMService {
	@Autowired
	ATMRepository atmRepository;
	
	private String dataAccessException = "distributed transaction exception!";
	private String transientDataAccessException = "database timeout! exception!";

	@Override
	public List<ATMDTO> viewAllTransaction() {
		return (List<ATMDTO>)atmRepository.findAll();
	}

	@Override
	public boolean addAddress(ATMDTO address) {
		try {
		atmRepository.save(address);
		} catch (RecoverableDataAccessException  e) {
			
			
			throw new CrudException(dataAccessException);
		
		} catch (TransientDataAccessException e) {
			
			throw new CrudException(transientDataAccessException);
			
		}
		return true;
	}

	@Override
	public boolean updateAddress(ATMDTO address) {
		Optional<ATMDTO> find=atmRepository.findById(address.getTransactionId());
		if(find.isPresent()) {
			atmRepository.save(address);
			return true;
		}
		return false;
	}

	
	/*
	 * name - deleteaddress from the address-ms
	 * description - it will delete available address from the management system
	 */
	
	@Override
	public boolean deleteAddress(String addressId) {
		try {
		atmRepository.deleteById(addressId);
} catch (RecoverableDataAccessException  e) {
			
			throw new CrudException(dataAccessException);
			
		}catch (TransientDataAccessException e) {
			
			throw new CrudException(transientDataAccessException);
			
		}
		return true;
	}




	}
