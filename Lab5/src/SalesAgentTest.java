/*
 * File Name: SalesAgentTest
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 5
 * Date: 11.Nov.2022
 * Professor: Justin Martins
 */

/**
   This program is the first test for the SalesAgent class including the subclass. Check the lab slides to ensure you include every item required.
   @author Leonardo_Villalobos
*/
public class SalesAgentTest
{  
   public static void main(String[] args)
   {
	//... your code starts here!
	   System.out.println("SAMPLE OUTPUT FOR SalesAgentTest with some data included.\n");
	   
	   /**
	    * The following objects are instantiated:
	    *  1 SalesAgent objects referring to SalesAgent class
	    *  1 SalesSupervisor object referring to SalesAgent class
	    */
	   SalesAgent sa1 = new SalesAgent("Andrew", 42);
	   SalesAgent ss1 = new SalesSupervisor("James", 26, "Perth");
	   
	   /**
	    * Prints to console the different implementations of toSring() method
	    */
	   System.out.println(sa1.toString());
	   System.out.println(ss1.toString());
   }
}  