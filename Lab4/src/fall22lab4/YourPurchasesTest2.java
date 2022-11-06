/*
 * File Name: YourPurchasesTest2
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 4
 * Date: 14.Oct.2022
 * Professor: Justin Martins
 */

package fall22lab4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest2 {

	private static final double EPSILON = 1E-12;
	
	/**
	 * This test would fail because CalculateChange method is not properly implemented.
	 */
	//THIS TEST WOULD FAIL. 
	// TODO: WRITE ONE OR MORE TESTS TO SYSTEMATICALLY FIND THE SOURCE OF THE TEST FAILURE 
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);
	}
	
	 // YOUR TASKS ARE STATED HERE: 
	   // RUN THE TEST CASE IN YourPurchasesTest2.java, TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
	   // IMPROVE THIS CODE BY SYSTEMATICALLY ADDING MORE TEST CASES (NOT ALREADY STATED IN THIS CODE)
	   // TO LOCATE THE METHOD THAT IS CAUSING THE TEST FAILURE
	   
	   // ADD NEW TEST CASES HERE!!!
	/**
	 * If failures encountered then CalculateChange method should be modified.
	 */	
	@Test
	public void secondTestCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double unexpected = 6.5;
	    Assert.assertNotEquals(unexpected, changeResult, EPSILON);
		assertTrue(true);
	}
	
	/**
	 * If not failures encountered then CalculateChange method should be modified.
	 */
	@Test
	public void thirdTestCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double unexpected = 3.5;
	    Assert.assertNotEquals(unexpected, changeResult, EPSILON);
		assertTrue(true);
	}	
}
