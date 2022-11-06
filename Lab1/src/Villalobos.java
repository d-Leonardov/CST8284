/*
 * File Name: Villalobos
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 1
 * Date: 22.Sep.2022
 * Professor: Justin Martins
 * Class list: Villalobos, User, DateCalculation
 */




/**
 * Main method of Lab1.
 * Calls methods from DateCalculation and Users classes.
 * Inside decision-making statement, if the last digit of the student number is an odd number 
 * then calls weeks method from DateCalculation class, otherwise if the last digit is an 
 * even number calls months method from DateCalculation class.
 * @author Leonardo Villalobos.
 * @version JDK 11.05.15
 */
public class Villalobos {
	
	/**
	 * @param args
	 * Default main method
	 */
	public static void main(String[] args) {
		
		/**
		 * Invoking User constructor
		 */
		User user = new User();
		
		/**
		 * Invoking DateCalculation constructor.
		 */
		DateCalculation date = new DateCalculation();
		
		/**
		 * Calls inputName method and stores returned value into name String variable.
		 */
		String name = user.inputName("Enter your name");
		
		/**
		 * Calls inputNumber method and stores returned value into studentNumber int variable.
		 */
		int studentNumber = user.inputNumber("Enter your Student Number");
		
		/**
		 * Calls inputReasons method and stores returned values into reason1 and 
		 * reason2 String variables.
		 */
		String reason1 = user.inputReasons("Why are you taking this course? Enter two reasons");
		String reason2 = user.inputReasons();
		
		/**
		 * Gets the last digit of the student number by using modulo operator.
		 * Source code retrieved from <a> href:https://www.codingbroz.com/java-program-to-find-last-digit-of-a-number/</a>
		 */
		int lastNumber = studentNumber % 10;
		
		if (lastNumber%2 != 0) {
			System.out.println("Your name is :\n" + name);
			System.out.println("Your student number is :\n" + studentNumber);
			System.out.println("The reasons you are taking this course are : \n1. " + reason1 + "\n2. " + 
								reason2);	
			date.weeks();
			
		} else {
			System.out.println("Your name is :\n" + name);
			System.out.println("Your student number is :\n" + studentNumber);
			System.out.println("The reasons you are taking this course are : \n" +  reason1 + "\n" + 
								reason2);		
			date.months();
		}
	}
}


