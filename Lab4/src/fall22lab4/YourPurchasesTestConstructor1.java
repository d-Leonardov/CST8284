/*
 * File Name: YourPurchasesTestConstructor1
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 4
 * Date: 14.Oct.2022
 * Professor: Justin Martins
 */

package fall22lab4;

import static org.junit.Assert.*;

import org.junit.Test;


public class YourPurchasesTestConstructor1 {
	
	/**
	 * Constant EPSILON defined to be passed as a parameter in assertEquals method.
	 */
	private static final double EPSILON = 1E-12;
	
	/**
	 * This JUnit test case tests the correct value of payment inside constructor.
	 * @author Leonardo Villalobos
	 */
	@Test
	public void testYourPurchases() {
		var constructor = new YourPurchases();
		double expectedPurchase = 0;
		double actualPurchaseValue = constructor.getPurchase();
		assertEquals( "Purchase constuctor did not set correct purchase value", expectedPurchase, actualPurchaseValue,EPSILON);
	}

}
