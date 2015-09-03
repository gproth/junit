package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ATMTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeposit() {
		ATM test = new ATM(2000.0);
		test.deposit(200.0);
		assertEquals(test.getBalance(), 2200.0, .1);
	}
	
	@Test
	public void testBadDeposit() {
		ATM test = new ATM(2000.0);
		try{
			test.deposit(-100.0);
		}catch(IllegalArgumentException IlArE){
			return;
		}
		fail();
	}
	
	@Test
	public void testGetBalance() {
		ATM test = new ATM(2000.0);
		assertEquals(test.getBalance(), 2000.0, .1);
	}

	

	@Test
	public void testWithdraw() {
		ATM test = new ATM(2000.0);
		test.withdraw(200.0);
		assertEquals(test.getBalance(), 1800.0, .1);
	}
	
	@Test
	public void testToString() {
		ATM test = new ATM(2000.0);
		assertTrue(test.toString().equals("Amount balance is $2000.00"));
		
	}

}
