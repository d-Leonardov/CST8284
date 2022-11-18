/*
 * File Name: Invoice
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 6
 * Date: 18.Nov.2022
 * Professor: Justin Martins
 */

//LAB 6 - CST8284
//LAB 6: Invoice.java

//This is the Invoice class which is an UNRELATED CLASS to the Programmer superclass

//The Invoice class implements Payme interface. NO MODIFICATION IS REQUIRED HERE!!!

/**
 * Subclass of Payme Interface
 * @author Leonardo_Villalobos
 *
 */
public class Invoice implements Payme {

	private String partNumber; 
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	//four-argument constructor
	/**
	 * 
	 * @param part String part number
	 * @param description String part description
	 * @param count int number of items
	 * @param price int price per item
	 */
	public Invoice(String part, String description, int count, 
	 double price) {
	 partNumber = part;
	 partDescription = description;
	 setQuantity(count); // validate and store quantity
	 setPricePerItem(price); // validate and store price per item
	}
	
	//set part number
	/**
	 * Mutator for part number
	 * @param part String part number
	 */
	public void setPartNumber(String part) {
	 partNumber = part; // should validate
	}
	
	//get part number
	/**
	 * Accessor for part number
	 * @return String part number
	 */
	public String getPartNumber() {
	 return partNumber;
	}
	
	//set description
	/**
	 * Mutator for part description
	 * @param description String 
	 */
	public void setPartDescription(String description) {
	 partDescription = description; // should validate
	}
	
	//get description
	/**
	 * Accessor for part description
	 * @return String part description
	 */
	public String getPartDescription() {
	 return partDescription;
	}
	
	//set quantity
	/**
	 * Mutator for count
	 * @param count int number of items
	 */
	public void setQuantity(int count) {
	 quantity = (count < 0) ? 0 : count; // quantity cannot be negative
	}
	
	//get quantity
	/**
	 * Accessor for quantity
	 * @return quantity
	 */
	public int getQuantity() {
	 return quantity;
	}
	
	//set price per item
	/**
	 * Mutator for price
	 * @param price
	 */
	public void setPricePerItem(double price) {
	 pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	}
	
	//get price per item
	/**
	 * Accessor for price per item
	 * @return pricePerTiem double
	 */
	public double getPricePerItem() {
	 return pricePerItem;
	}
	
	//return String representation of Invoice object
	/**
	 * Overridden method for Payme interface
	 * @return payment due - (quantity * price per item)
	 */
	@Override
	public String toString() {
	 return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
	    "invoice", "part number", getPartNumber(), getPartDescription(), 
	    "quantity", getQuantity(), "price per item", getPricePerItem());
	} 
	
	//method required to carry out contract with interface Payme
	@Override
	public double getPaymentAmount() {
	 return getQuantity() * getPricePerItem(); // calculate total cost
	}
}


