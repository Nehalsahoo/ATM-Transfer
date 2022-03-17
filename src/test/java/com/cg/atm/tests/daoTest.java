package com.cg.atm.tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import com.cg.atm.dto.ATMDTO;
import com.cg.atm.service.ATMServiceImpl;


public class daoTest {
	private static ATMServiceImpl test;
//	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		test = new ATMServiceImpl();
	}

  @AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testviewAllAddress() {
		List<ATMDTO> result = test. viewAllTransaction();
		assertNotNull(result);
	}
	@Test
	public void testAddAddress() {
		
		boolean result;
		result = test.addAddress(new ATMDTO( ));
		assertTrue(result);
		
	}}
