/*
 * File Name: SalariedProgrammer
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 6
 * Date: 18.Nov.2022
 * Professor: Justin Martins
 */

// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//SalariedProgrammer.java
//SalariedProgrammer concrete class extends abstract class Programmer.

/**
 * Subclass of Programmer abstract superclass
 * @author Leonardo_Villalobos
 *
 */
public class SalariedProgrammer extends Programmer {
	private double weeklySalary;
	/**
	 * Constructor
	 * @param firstName no space string
	 * @param lastName no space string
	 * @param socialSecurityNumber no space numbered-string (format "1111111"
	 * @param weeklySalary double
	 */
	//constructor
	public SalariedProgrammer(String firstName, String lastName, 
	String socialSecurityNumber, double weeklySalary) {
	super(firstName, lastName, socialSecurityNumber);
	
	if (weeklySalary < 0.0) {
	  throw new IllegalArgumentException(
	     "Weekly salary must be >= 0.0");
	}
	
	this.weeklySalary = weeklySalary;
	} 
	
	/**
	 * Mutator for weeklySalary
	 * @param weeklySalary
	 */
	//set salary
	public void setWeeklySalary(double weeklySalary) {
	if (weeklySalary < 0.0) {
	  throw new IllegalArgumentException(
	     "Weekly salary must be >= 0.0");
	}
	
	this.weeklySalary = weeklySalary;
	} 
	
	/**
	 * Accessor for weeklySalary
	 * @return weekly salary (fixed double value)
	 */
	//return salary
	public double getWeeklySalary() {
		return weeklySalary;
	} 
	
	//calculate earnings; override abstract method earnings in Programmer
	
	//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
	/**
	 * Overridden method for Payme interface
	 * @return weeklySalary value
	 */
	@Override                                                           
	public double getPaymentAmount() {                                          
		return getWeeklySalary();                                        
	}                                             
	
	//return String representation of SalariedProgrammer object   
	                             
	//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
	//START     
	// INSERT YOUR CODE
	
	/**
	 * Overridden method for Programmer class 
	 * @return report with First name ,Last Name ,Social Security and weekly salary information
	 */
	@Override
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: $%,.2f",
				"salaried Programmer", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(),
			    "weekly salary", getWeeklySalary());
	}
	/**
	 * There is no real implementation for this method on this class,
	 * it has been implemented because it was inherited from an abstract superclass.
	 * @return paymentAmount method's value
	 */
	@Override
	public double earnings() {
		return getPaymentAmount();
	}
}       
//END


