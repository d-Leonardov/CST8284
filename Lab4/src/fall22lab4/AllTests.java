/*
 * File Name: AllTests
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 4
 * Date: 14.Oct.2022
 * Professor: Justin Martins
 */

package fall22lab4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This Test Suite goes through 7 test cases and asserts true for Constructors and Methods.
 * Getters are not tested as the assertion for Constructors serve the same purpose.
 * @author Leonardo Villalobos
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ YourPurchasesTest.class, YourPurchasesTest2.class, YourPurchasesTestConstructor1.class,
		YourPurchasesTestConstructor2.class, YourPurchasesTestGiveChange.class, YourPurchasesTestReceivePayment.class,
		YourPurchasesTestRecordPurchase.class })
public class AllTests {

}
