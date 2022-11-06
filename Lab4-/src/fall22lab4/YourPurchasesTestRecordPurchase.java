/*
 * File Name: YourPurchasesTestRecordPurchase
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 4
 * Date: 14.Oct.2022
 * Professor: Justin Martins
 */

package fall22lab4;

import static org.junit.Assert.*;

import org.junit.Test;

public class YourPurchasesTestRecordPurchase {
	
	/**
	 * Constant EPSILON defined to be passed as a parameter in assertEquals method.
	 */
	private static final double EPSILON = 1E-12;

	/**
	 * This JUnit test case tests if the correct purchase price was recorded when RecordPurchase 
	 * is called.
	 * @author Leonardo Villalobos
	 */
	@Test
	public final void testRecordPurchase() {
		var register = new YourPurchases();
		register.recordPurchase(10);
		double actualPurchase = register.getPurchase();
		double expectedPurchase = 10;
		assertEquals("Method RecordPurchase doesn't record the correct purchase price", 
				expectedPurchase, actualPurchase, EPSILON);		
	}

}
