/*
 * File Name: MyHealthDataTest
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Assignment 1
 * Date: 04.Nov.2022
 * Professor: Justin Martins
 */

import java.time.LocalDate;
import java.util.Scanner;
/**
 * This class prompts user for input and displays information regarding his/her health status
 * such as BMI (Body Mass Index) and Heart rate.
 * During user inputs program validates if entered values match values type.
 * Setters update variables values according to user's input in methods within MyHealthData class
 * @author Leonardo Villalobos
 *
 */
public class MyHealthDataTest {

	/**
	 * No parameter constructor for MyHealthDataTest
	 */
	public MyHealthDataTest() {
		
	}
	public static void main(String[] args) {
		
		/**
		 * Variables initialized so that object from MyHealthData can be instantiated
		 */
		Scanner input = new Scanner(System.in);
		String firstName = null;
		String lastName = null;
		String gender = null;
		int birthYear = 0;
		int currentYear = LocalDate.now().getYear();
		double height = 0;
		double weight = 0 ;
		
		/**
		 * Object from MyHealthData class
		 */
		MyHealthData healthData = new MyHealthData(firstName, lastName, gender, birthYear, currentYear, height, weight);
		
		System.out.println("Enter your first name:");
		if(input.hasNext("[A-Za-z]*")) {
			firstName = input.next();
		}else {
			while (!input.hasNext("[A-Za-z]*")) {
				System.out.println("Enter a valid value");
				input.nextLine();
			}
			firstName = input.next();
		}
		healthData.setFirstName(firstName);
		input.nextLine();

		System.out.println("Enter your last name:");
		if(input.hasNext("[A-Za-z]*")) {
			lastName = input.next();
		}else {
			while (!input.hasNext("[A-Za-z]*")) {
				System.out.println("Enter a valid value");
				input.nextLine();
			}
			lastName = input.next();
		}
		healthData.setLastName(lastName);
		input.nextLine();

		System.out.println("Enter your gender ('F' or 'M'):");
		if(input.hasNext("[A-Za-z]*")) {
			gender = input.next();
		}else {
			while (!input.hasNext("[A-Za-z]*")) {
				System.out.println("Enter a valid value");
				input.nextLine();
			}
			gender = input.next();
		}
		healthData.setGender(gender);
		input.nextLine();		
		
		System.out.println("Enter the year of your birth");
		if(input.hasNextInt()) {
			birthYear = input.nextInt();
		}else {
			while (!input.hasNextInt()) {
				System.out.println("Enter a valid value");
				input.nextLine();
			}
			birthYear = input.nextInt();
		}
		healthData.setBirthYear(birthYear);
		input.nextLine();	
		
		System.out.println("Enter your height in inches");
		if(input.hasNextDouble()) {
			height = input.nextDouble();
		}else {
			while (!input.hasNextDouble()) {
				System.out.println("Enter a valid value");
				input.nextLine();
			}
			height = input.nextDouble();
		}
		healthData.setHeight(height);
		input.nextLine();		
		
		System.out.println("Enter your weight in pounds");
		if(input.hasNextDouble()) {
			weight = input.nextDouble();
		}else {
			while (!input.hasNextDouble()) {
				System.out.println("Enter a valid value");
				input.nextLine();
			}
			weight = input.nextDouble();
		}
		healthData.setWeight(weight);
		input.nextLine();	
		input.close();
		
		healthData.displayMyHealthData();
	}
}

