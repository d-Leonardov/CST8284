/*
 * File Name: YourPurchasesTestReceivePayment
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 4
 * Date: 14.Oct.2022
 * Professor: Justin Martins
 */

package fall22lab4;

import static org.junit.Assert.*;

import org.junit.Test;

public class YourPurchasesTestReceivePayment {
	
	/**
	 * Constant EPSILON defined to be passed as a parameter in assertEquals method.
	 */
	private static final double EPSILON = 1E-12;
	
	/**
	 * This JUnit test case tests if the correct payment was received.
	 * @author Leonardo Villalobos
	 */
	@Test
	public void testReceivePayment() {
		var cashier = new YourPurchases();
		cashier.receivePayment(1, 1, 1, 1, 1);
		double paymentReceived = cashier.getPayment();
		double expectedPayment = 1.41;
		assertEquals("Method receivePayment doesn't calculate the correct payment received", 
				expectedPayment, paymentReceived, EPSILON);	
	}

}
