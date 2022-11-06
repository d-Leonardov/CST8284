/*
 * File Name: YourPurchasesTest
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 4
 * Date: 14.Oct.2022
 * Professor: Justin Martins
 */

package fall22lab4;

import org.junit.Test;

// import static org.junit.Assert.assertTrue;

import org.junit.Assert;

public class YourPurchasesTest
{
   private static final double EPSILON = 1E-12;

   @Test public void twoPurchases()
   {
      YourPurchases register = new YourPurchases();
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);
      register.receivePayment(2, 0, 5, 0, 0);
      double expected = 0.25;
      Assert.assertEquals(expected, register.giveChange(), EPSILON);
    }
   
// YOUR TASKS ARE STATED HERE: 
   // RUN THE CODE YOU RECEIVED AND DEMO THAT THERE IS NO ERROR in YourPurchasesTest.java 
     
   }

