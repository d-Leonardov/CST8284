/*
 * File Name: Programmer
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 6
 * Date: 18.Nov.2022
 * Professor: Justin Martins
 */

// LAB 6: YOU ARE REQUIRED TO MODIFY THIS CODE!!!

//Programmer.java

//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.

//SOME MODIFICATION ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!

/**
 * Subclass of Payme interface
 * @author Leonardo_Villalobos
 *
 */
public abstract class Programmer implements Payme {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	//three-argument constructor
	/**
	 * Constructor
	 * @param first first name
	 * @param last last name
	 * @param ssn social security number
	 */
	public Programmer(String first, String last, String ssn) {
	 firstName = first;
	 lastName = last;
	 socialSecurityNumber = ssn;
	}
	

	/* CHANGES ARE REQUIRED IN THIS SECTION. 
	* THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES.
	* IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
	*/
	/**
	 * Accessor for firstName
	 * @return String firstName 
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Accessor for lastName
	 * @return String lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Accessor for socialSecurityNumber
	 * @return numbered-String
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	//return String representation of Programmer object
	/**
	 * Overridden method for Object superclass
	 * @return report with First name ,Last Name and Social Security information
	 */
	@Override
	public String toString() {
	return String.format("%s %s\n%s: %s\n%s: %s", 
	  getFirstName(), getLastName(), getSocialSecurityNumber());
	} 
	
	/**
	 * This abstract method forces this class to change to abstract class
	 * @return
	 */
	//Note: We do NOT implement Payme method getPaymentAmount() here. 
	// THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....??
	public abstract double earnings(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/
} 


