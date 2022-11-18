/*
 * File Name: HourlyProgrammer
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 6
 * Date: 18.Nov.2022
 * Professor: Justin Martins
 */

// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

// HourlyProgrammer.java
// HourlyProgrammer class extends Programmer.
/**
 * Subclass of Programmer abstract superclass
 * @author Leonardo_Villalobos
 *
 */
public class HourlyProgrammer extends Programmer {
	private double wage; // wage per hour
	private double hours; // hours worked for week
	
	//constructor
	/**
	 * Constructor
	 * @param firstName String 
	 * @param lastName String
	 * @param socialSecurityNumber String
	 * @param wage double
	 * @param hours double
	 */
	public HourlyProgrammer(String firstName, String lastName,
	String socialSecurityNumber, double wage, double hours) {
	super(firstName, lastName, socialSecurityNumber);
	
	if (wage < 0.0) { // validate wage
	  throw new IllegalArgumentException(
	     "Hourly wage must be >= 0.0");
	}
	
	if ((hours < 0.0) || (hours > 168.0)) { // validate hours
	  throw new IllegalArgumentException(
	     "Hours worked must be >= 0.0 and <= 168.0");
	}
	
	this.wage = wage;
	this.hours = hours;
	} 
	
	//set wage
	/**
	 * Mutator for wage
	 * @param wage only positive values allowed
	 */
	public void setWage(double wage) {
	if (wage < 0.0) { // validate wage
	  throw new IllegalArgumentException(
	     "Hourly wage must be >= 0.0");
	}
	
	this.wage = wage;
	} 
	
	//return wage
	/**
	 * Accessor for wage
	 * @return wage double
	 */
	public double getWage() {
	return wage;
	} 
	
	//set hours worked
	/**
	 * Mutator for hours
	 * @param hours double allowed value from 0 to 168 inclusive
	 */
	public void setHours(double hours) {
	if ((hours < 0.0) || (hours > 168.0)) { // validate hours
	  throw new IllegalArgumentException(
	     "Hours worked must be >= 0.0 and <= 168.0");
	}
	
	this.hours = hours;
	} 
	
	//return hours worked
	/**
	 * Accessor for hours
	 * @return hours double
	 */
	public double getHours() {
		return hours;
	} 
	
	//calculate earnings; override abstract method earnings in Programmer
	
	//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
	
	/**
	 * Overridden method for Payme interface.
	 * Overtime pay begins after 44 worked hours per week (not 40 hours as shown in the initial
	 * given code)
	 * The name of this method has been changed from earnings to getPaymentAmount so this
	 * class keeps under inherentance hierarchy from Payme interface instead of Programmer superclass 
	 * 
	 */
	@Override                                                           
	public double getPaymentAmount() {                                            
		if (getHours() <= 44) { // no overtime                           
			return getWage() * getHours();   
		}
		else {                                                             
			return 44 * getWage() + (getHours() - 44) * getWage() * 1.5;
		}
	}                                          
	
	//return String representation of HourlyProgrammer object              
	
	//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
	//START     
	// INSERT YOUR CODE
	/**
	 * Overridden method for Programmer abstract superclass
	 */
	@Override
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: $%,.2f; %s: %,.2f",
			    "hourly Programmer", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(),
			    "hourly wage", getWage(), "hours worked", getHours());
	}
	//END
	/**
	 * There is no actual implementation for this method on this class,
	 * it has been implemented because it was inherited from an abstract superclass.
	 * @return paymentAmount method's value
	 */
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getPaymentAmount();
	}
	                   
}

