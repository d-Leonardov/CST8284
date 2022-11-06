/*
 * File Name: YourPurchasesTestGiveChange
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 4
 * Date: 14.Oct.2022
 * Professor: Justin Martins
 */

package fall22lab4;

import static org.junit.Assert.*;
import org.junit.Test;

public class YourPurchasesTestGiveChange {
	
	/**
	 * Constant EPSILON defined to be passed as a parameter in assertEquals method.
	 */
	private static final double EPSILON = 1E-12;
	
	/**
	 * This JUnit test case tests if change due is calculated correctly.
	 * @author Leonardo Villalobos
	 */
	@Test
	public void testGiveChange() {
		YourPurchases dueChange = new YourPurchases();
		dueChange.recordPurchase(3);
		dueChange.receivePayment(2, 3, 2, 1, 0);
		double actualChange = dueChange.giveChange();
		double expectedChange = 0;
	    assertEquals("Method giveChange doesn't calculate the correct change due",expectedChange, actualChange, EPSILON);
	}

}
