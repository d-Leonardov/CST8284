/*
 * File Name: PaymeInterfaceTest
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 6
 * Date: 18.Nov.2022
 * Professor: Justin Martins
 */

// LAB 6: PaymeInterfaceTest.java

//This is the test for your interface Payme.

/**
 * This class tests interface Payme
 * @author Leonardo_Villalobos
 *
 */
public class PaymeInterfaceTest  {

	public static void main(String[] args) {
	
		//TO DO: IN THIS PORTION OF THE CODE, SEVERAL CHANGES SHOULD BE MADE:
		// CREATE SIX-ELEMENTS Payme array HERE 
		/**
		 * Array holding six Payme reference objects	
		 */
		 //START CODE 
		Payme[] paymeObjects = new Payme[6];
		//END CODE

		// TO DO: POPULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
		//CHECK THE OUTPUT FILE AND REUSE EXACTLY THE DETAILS PROVIDED SUCH AS FIRST NAME
		// LAST NAME, SOCIAL INSURANCE NUMBER, ETC.
		/**
		 * This code is used to initialize the objects created in the arrays by passing arguments in the constructors
		 */
		// START CODE
		paymeObjects[0] = new Invoice("22776", "Brakes", 3, 300);
		paymeObjects[1] = new Invoice("33442", "gear", 5, 90.99);
		paymeObjects[2] = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 320);
		paymeObjects[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 18.95, 40);
		paymeObjects[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 16500, 0.44);
		paymeObjects[5] = new BasePlusCommissionProgrammer("Leonardo", "Villalobos", "111-11-1111", 1200, 0.04, 720);
		// END CODE
				
		System.out.println(
		    "Payment for Invoices and Programmers are processed polymorphically:\n"); 
		
		/**
		 * Enhanced loop for accessing each element of Payme array
		 */
		 // generically process each element in array paymeObjects
		for (Payme currentPayme : paymeObjects) {
		    // output currentPayme and its appropriate payment amount
		    System.out.printf("%s\n", currentPayme.toString()); 
			       
		    if (currentPayme instanceof BasePlusCommissionProgrammer) {
		       // downcast Payme reference to 
		       // BasePlusCommissioProgrammer reference
		       BasePlusCommissionProgrammer programmer = 
		          (BasePlusCommissionProgrammer) currentPayme;
		
		       double oldBaseSalary = programmer.getBaseSalary();
		       programmer.setBaseSalary(1.10 * oldBaseSalary);
		       System.out.printf(
		          "new base salary with 10%% increase is: $%,.2f\n",
		          programmer.getBaseSalary());
		    } 
		
		// TO DO: INSERT YOUR PRINT STATEMENT HERE: ENSURE THAT YOUR 
		// OUTPUT FOLLOWS THE OUTPUT SAMPLE PROVIDED
		/**
		 * Prints the payment due lines on every Payme objects
		 */
		// START CODE 
		System.out.printf("%s: $%,.2f \n\n", "payment due", currentPayme.getPaymentAmount());
		// END CODE
		}
	}
}


