/*
 * File Name: SalesSupervisor
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 5
 * Date: 11.Nov.2022
 * Professor: Justin Martins
 */

/**
 * Subclass Sales supervisor inherits from parent class Sales Agent 
 * @author Leonardo_Villalobos
 * 
 */
public class SalesSupervisor extends SalesAgent {

	private String location;

	/**
	 * Constructor for SalesSupervisor class
	 * @param n the name of the Sales Supervisor
	 * @param a the age of the Sales Supervisor
	 * @param l the location of the Sales Supervisor
	 */
	public SalesSupervisor(String n, int a, String l) {
		super(n, a);
		this.location = l;
	}

	@Override
	public String toString() {
		return "Sales supervisor [super=" + super.toString() + ",location=" + location +"]";
	}
}
