/*
 * File Name: ProgrammerBasePlusCommissionProgrammer
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 6
 * Date: 18.Nov.2022
 * Professor: Justin Martins
 */

// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!


//BasePlusCommissionProgrammer.java
//BasePlusCommissionProgrammer class extends CommissionProgrammer.

/**
 * Subclass of CommissionProgrammer superclass
 * @author Leonardo_Villalobos
 *
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 
	
	private double baseSalary; // base salary per week
	
	//constructor
	/**
	 * Constructor
	 * @param firstName String
	 * @param lastName String
	 * @param socialSecurityNumber String
	 * @param grossSales double
	 * @param commissionRate double
	 * @param baseSalary double
	 */
	public BasePlusCommissionProgrammer(String firstName, String lastName, 
	String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
	super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
	
	if (baseSalary < 0.0) { // validate baseSalary                  
	  throw new IllegalArgumentException("Base salary must be >= 0.0");
	}
	
	this.baseSalary = baseSalary;                
	}
	
	//set base salary
	/**
	 * Mutator for baseSalary
	 * @param baseSalary double
	 * @throws IllegalArgumentException if baseSalary is lower than zero
	 */
	public void setBaseSalary(double baseSalary) {
	if (baseSalary < 0.0) { // validate baseSalary                  
	  throw new IllegalArgumentException("Base salary must be >= 0.0");
	}
	
	this.baseSalary = baseSalary;                
	} 
	
	//return base salary}
	/**
	 * Accessor for baseSalary
	 * @return baseSalary double
	 */
	public double getBaseSalary() {
		return baseSalary;
	}
	
	//calculate earnings; override method earnings in CommissionProgrammer
	
	//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
	
	/**
	 * Overridden method for CommissionProgrammer superclass
	 * @return payment due - (base salary + (commission Rate * gross sale))
	 */
	@Override                                                            
	public double getPaymentAmount() {                                             
		return getBaseSalary() + super.getPaymentAmount();                        
	} 
	
	//return String representation of BasePlusCommissionProgrammer object
	    
	//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
	//START     
	// INSERT YOUR CODE
	/**
	 * Overridden method for CommissionProgrammer superclass
	 * @return report with First name ,Last Name ,Social Security and weekly salary information
	 */
	@Override
	public String toString() {
			// TODO Auto-generated method stub
		return String.format("%s: %s %s\n%s: %s\n%s: $%,.2f; %s: %,.2f; %s: $%,.2f",
			    "base-plus commission programmer", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(),
			    "gross sales", getGrossSales(), "commission rate", getCommissionRate(), "base salary" , getBaseSalary()); 
			    
	}
	//END
	

}



