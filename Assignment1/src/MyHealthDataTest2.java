/*
 * File Name: MyHealthDataTest2
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Assignment 1
 * Date: 04.Nov.2022
 * Professor: Justin Martins
 */

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

/**
 * This JUnit Class asserts 2 different scenarios.
 * @author Leonardo Villalobos
 * 
 */
public class MyHealthDataTest2 {

	/**
	 * Variable epsilon is the maximum delta between expected and actual for which 
	 * both numbers are considered equal. Margin error of 1 decimal place
	 * 
	 */
	double epsilon = 0.1;

//	/**
//	 * Asserts that expected value and actual value are equal
//	 * It does not return any error.
//	 * @param value 66.9 in constructors' parameters is for height
//	 * @param value 163.13 in constructors' parameters is for weight
//	 * 
//	 */
//	@Test
//	public void test1() {
//		MyHealthData data = new MyHealthData(null, null, null, 0, 0, 66.9, 163.13);
//		double expectedValue = 25.6;
//		double actualValue = data.getBMI();
//		assertEquals(expectedValue, actualValue, epsilon);
//	}
	
	/**
	* Assumption using multiplication operator instead of division operator inside method getBMI
	* Returns error
	* @param value 66.9 in constructors' parameters is for height
	* @param value 163.13 in constructors' parameters is for weight
	*/
	@Test
	public void test2() {
		MyHealthData data = new MyHealthData(null, null, null, 0, 0, 66.9, 163.13);
		double expectedValue = 25.6; 
		double actualValue = data.getBMI();
		assertEquals(expectedValue, actualValue, epsilon);
	}
	
	
}