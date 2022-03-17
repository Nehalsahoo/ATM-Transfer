package com.cg.atm.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.atm.dto.ATMDTO;

public interface ATMRepository extends CrudRepository<ATMDTO,String> {

}
