package com.cg.atm.controller;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.atm.dto.ATMDTO;
import com.cg.atm.exceptions.NullParameterException;
import com.cg.atm.service.ATMService;



//this is a restcontroller
@RestController
@RequestMapping("/ATM")
public class ATMController {

	//private static final Logger logger =Logger.getLogger(ATMController.class);
	
	@Autowired
	ATMService ATMService;

	@GetMapping("/viewALLTransaction")
	List<ATMDTO> viewAllTransaction() {
		// repository.findAllTransaction().forEach(i -> list.add(i));
		return ATMService.viewAllTransaction();
	}

	@PostMapping("/Transaction")
	String addAddress(@RequestBody ATMDTO address) throws Exception {
		
		if(address==null) {
			
			//logger.error("Null request, add transaction details not provided at /transaction");
			//throw new NullParameterException("Null request, please provide transaction details!");

		}
		String status = "Money added";
		ATMService.addAddress(address);
		return status;
		
//		String status = "Money added";
//
//		if (addressService.addAddress(address)) {
//			return status;
//		}
//		return "fail to add Address";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//1	@PostMapping("/updateAddress")
//1	String updateAddress(@RequestBody ATMDTO address) throws Exception {
		
   //1     if(address==null) {
			
		//	logger.error("Null request, Address details not provided at /updateAddress");
		//	throw new NullParameterException("Null request, please provide address details!");

	//1	}
    //1          String status = "Address Updated";
     //1         addressService.updateAddress(address);
      //1         return status;
		
//		String status = "Address Updated";
//
//		if (addressService.updateAddress(address)) {
//			return status;
//		}
//		return "Failed to update Address";
	//1}

//1	@PostMapping("/deleteAddress")
	//1 String deleteAddress(@RequestParam String addressId) throws Exception {
		
	//1	  if(addressId==null) {
				
			//	logger.error("Null request, Address details not provided at /deleteAddress");
			//	throw new NullParameterException("Null request, please provide address details to remove from existing address");

	//1		}
		
		
	//1	  String status = "Address deleted";
	//1	  addressService.deleteAddress(addressId);
	//1	  return status;
		
//		if (addressService.deleteAddress(addressId)) {
//			return "Address Deleted Successfully";
//		}
//		return "error";
	//1}
}










