/*
 * File Name: CommissionProgrammer
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 6
 * Date: 18.Nov.2022
 * Professor: Justin Martins
 */

// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//CommissionProgrammer.java

//CommissionProgrammer class extends Programmer.
/**
 * Subclass of Programmer abstract superclass
 * @author Leonardo_Villalobos
 *
 */
public class CommissionProgrammer extends Programmer { 

	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	
	
	//constructor
	/**
	 * Constructor
	 * @param firstName String
	 * @param lastName String
	 * @param socialSecurityNumber String
	 * @param grossSales double value should be a positive value
	 * @param commissionRate double value must be greater than 0 and less than 1
	 */
	public CommissionProgrammer(String firstName, String lastName, 
	String socialSecurityNumber, double grossSales, double commissionRate ) {
	super(firstName, lastName, socialSecurityNumber);
	
	if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
	  throw new IllegalArgumentException(
	     "Commission rate must be > 0.0 and < 1.0");
	}
	
	if (grossSales < 0.0) { // validate
	  throw new IllegalArgumentException("Gross sales must be >= 0.0");
	}
	
	this.grossSales = grossSales;
	this.commissionRate = commissionRate;
		
	} 
	
	//set gross sales amount on the creation of apps
	/**
	 * Mutator for grossSales
	 * @param grossSales must be a positive value
	 */
	public void setGrossSales(double grossSales) {
	if (grossSales < 0.0) { // validate
	  throw new IllegalArgumentException("Gross sales must be >= 0.0");
	}
	
	this.grossSales = grossSales;
	} 
	
	//return gross sales amount 
	/**
	 * Accessor for grossSales
	 * @return grossSales must be a positive value
	 */
	public double getGrossSales() {
		return grossSales;
	} 
	
	//set commission rate
	/**
	 * Mutator for comissionRate
	 * @param commissionRate value must be greater than 0 and less than 1
	 */
	public void setCommissionRate(double commissionRate) {
	if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
	  throw new IllegalArgumentException(
	     "Commission rate must be > 0.0 and < 1.0");
	}
	
	this.commissionRate = commissionRate;
	} 
	
	//return commission rate
	/**
	 * Accesor for comissionRate
	 * @return commisionRate double value must be greater than 0 and less than 1
	 */
	public double getCommissionRate() {
		return commissionRate;
	}
	
	//calculate earnings; override abstract method earnings in Programmer.
	
	//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
	/**
	 * Overridden method for Payme interface.
	 * The name of this method has been changed from earnings to getPaymentAmount so this
	 * class keeps under inherentance hierarchy from Payme interface instead of Programmer superclass 
	 */
	@Override                                                           
	public double getPaymentAmount() {                                            
		return getCommissionRate() * getGrossSales();                    
	}                                             
	
	//return String representation of CommissionProgrammer object
	
	//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
	//START     
	// INSERT YOUR CODE
	@Override
	/**
	 * Overridden method for Programmer abstract superclass
	 */
	public String toString() {
	    // TODO Auto-generated method stub
		return String.format("%s: %s %s\n%s: %s\n%s: $%,.2f; %s: %,.2f",
			    "commission programmer", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(),
			    "gross sales", getGrossSales(), "commission rate", getCommissionRate()); 
			
	}
	//END
	/**
	 * There is no actual implementation for this method on this class,
	 * it has been implemented because it was inherited from an abstract superclass.
	 * @return paymentAmount method's value
	 */
	@Override
	public double earnings() {
		return getPaymentAmount();
	}

}

