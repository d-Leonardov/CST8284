/*
 * File Name: SalesChief
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 5
 * Date: 11.Nov.2022
 * Professor: Justin Martins
 */

/**
 * Subclass Sales chief inherits from parent class Sales Supervisor
 * @author Leonardo_Villalobos
 *
 */
public class SalesChief extends SalesSupervisor{
	
	
	private String department;
	
	/**
	 * Constructor for SalesSupervisor class
	 * @param n the name of the Sales Chief
	 * @param a the age of the Sales Chief
	 * @param l the location of the Sales Chief
	 * @param d the department of the Sales Chief
	 */
	public SalesChief(String n, int a, String l, String d) {
		super(n, a, l);
		this.department = d;
	}
	
	@Override
	public String toString() {
		return "Sales Chief [super=" + super.toString() + ",department=" + department +"]";
	}
	


	

}
