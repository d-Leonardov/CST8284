/*
 * File Name: SalesAgentTest2
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 5
 * Date: 11.Nov.2022
 * Professor: Justin Martins
 */

/**
   This program is the second test for the SalesAgent class including the subclasses.
   @author Leonardo_Villalobos
*/
public class SalesAgentTest2
{  
   public static void main(String[] args)
   {
	 //... your code starts here!
	   System.out.println("SAMPLE OUTPUT FOR SalesAgentTest2.\n");
	   
	   /**
	    * The following objects are instantiated:
	    *  2 SalesAgent objects referring to SalesAgent class
	    *  1 SalesSupervisor object referring to SalesAgent class
	    *  1 SalesChief object referring to SalesAgent class
	    */
	   SalesAgent sa1 = new SalesAgent("Peter", 56);
	   SalesAgent sa2 = new SalesAgent("John", 48);
	   SalesAgent ss1 = new SalesSupervisor("Ifeoma", 53, "Toronto");
	   SalesAgent sc1 = new SalesChief("Leonardo", 35, "Ottawa", "IT");

	   /**
	    * Prints to console the different implementations of toSring() method
	    */
	   System.out.println(sa1.toString());
	   System.out.println(sa2.toString());
	   System.out.println(ss1.toString());
	   System.out.println(sc1.toString());
   }
}  