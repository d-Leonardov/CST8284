/*
 * File Name: User
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 1
 * Date: 22.Sep.2022
 * Professor: Justin Martins
 * Class list: Villalobos, User, DateCalculation
 */


import java.util.Scanner;

/**
 * Class implemented to get user's inputs and store them into variables for user's name, 
 * user's student number and user's reasons for taking this course .
 * @author Leonardo Villalobos.
 * @see java.util.Scanner
 * @version JDK 11.05.15
 * 
 */
public class User {
	/**
	 * Instantiation of class Scanner
	 */
	Scanner keyboard = new Scanner(System.in);
	
   /** 
	* Class constructor.
	*/
	public User () {
		//no-argument constructor
	}

	/**
	 * Takes the input for user's name
	 * @return String value holding the user's name
	 */
	public String inputName() {
		String value = keyboard.nextLine();
		return value;
	}
	
	/**
	 * Calls inputName method
	 * @param message
	 * Shows a message prompting the user to enter the user's name
	 * @return String value holding the user's name
	 */
	public String inputName(String message) {
		System.out.println(message);
		String value = inputName();
		return value;
	}
	
	/**
	 * Takes the input for user's reasons
	 * @return String value holding the user's reasons
	 */
	public String inputReasons() {
		String value = keyboard.nextLine();
		return value;
	}
	/**
	 * Calls inputReasons method.
	 * @param message
	 * Shows a message prompting the user to enter two reasons for taking this course.
	 * @return String value holding the user's reasons.
	 */
	public String inputReasons(String message) {
		System.out.println(message);
		String value = inputReasons();
		return value;
	}
	
	/**
	 * Takes the input for user's student number.
	 * @return integer value holding the user's student number.
	 */
	public int inputNumber() {
		int value = keyboard.nextInt();
		keyboard.nextLine();
		return value;
	}
	
	/**
	 * Calls inputNumber method.
	 * @param message
	 * Shows a message prompting the user to enter the user's student number.
	 * @return integer value holding the user's student number.
	 */
	public int inputNumber(String message) {
		System.out.println(message);
		int value = inputNumber();
		return value;
	}

}
