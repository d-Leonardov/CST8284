/*
 * File Name: MyHealthData
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Assignment 1
 * Date: 04.Nov.2022
 * Professor: Justin Martins
 */

//22F CST8284
//Assignment 1: MyHealthData.java

/**
 * Class keeps and displays health information about a patient 
 * @author Leonardo Villalobs
 *
 */
public class MyHealthData {
	//This system maintains important health information about a patient.
	//Note: This class assumes values passed to the set methods are correct.
	// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!


	//TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

	//START CODE
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int currentYear;
	private double height;
	private double weight;
	//END CODE


	// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
	//START CODE
	/**
	 * Parameterized constructor 
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param birthYear
	 * @param currentYear
	 * @param height
	 * @param weight
	 */
	public MyHealthData(String firstName, String lastName, String gender, int birthYear, int currentYear, 
			double height, double weight ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
		this.height = height;
		this.weight = weight;
	}
	//END CODE



	//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.
	/**
	 * Accessor method for First Name
	 * @return String firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * Mutator method for First Name
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * Accessor method for Last Name
	 * @return String lastName 
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * Mutator method for Last Name
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * Accessor method for Gender
	 * @return String gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * Mutator method for Gender
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * Accessor method for Birth year
	 * @return int birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}
	/**
	 * Mutator method for Birth year
	 * @param birthYear
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	/**
	 * Accessor method for Current year
	 * @return int currentYear
	 */
	public int getCurrentYear() {
		return currentYear;
	}
	/**
	 * Mutator method for Current year
	 * @param currentYear
	 */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	/**
	 * Accessor method for Height
	 * @return double height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * Mutator method for Height
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * Accessor method for Weight
	 * @return double weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * Mutator method for Weight
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * This method returns the patient's age
	 * @return int age
	 */
	public int getAge() {
		int age = getCurrentYear() - getBirthYear();
		return age;
	}
	/**
	 * This method returns the Maximum heart rate by subtracting the patient's age from 220 
	 * @return int maxHeartRate
	 */
	public int getMaximumHeartRate() {
		int maxHeartRate = 220 - getAge();
		return maxHeartRate;
	}
	/**
	 * This method returns the minimum target heart rate by calculating 50% from maximum heart rate
	 * @return double minTargetHeartRate
	 */
	public double getMinimumTargetHeartRate() {
		double minTargetHeartRate = getMaximumHeartRate() * 0.50;
		return minTargetHeartRate;
	}
	/**
	 * This method returns the minimum target heart rate by calculating 85% from maximum heart rate
	 * @return double maxTargetHeartRate
	 */
	public double getMaximumTargetHeartRate() {
		double maxTargetHeartRate = getMaximumHeartRate() * 0.85;
		return maxTargetHeartRate;
	}
	
	// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!
	/**
	 * This method returns the patient's Body Mass Index (BMI)
	 * @return double value
	 */
	public double getBMI() {
	   return (getWeight() * 703) / (getHeight() * getHeight());
	} 

	// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION

	/**
	 * This methods prints to console patient's information regarding his/her health condition.
	 * 
	 */
	public void displayMyHealthData() 
	{ 
		
	//TO DO 5: HINT: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.
	   
	// START CODE
		System.out.printf("PATIENT'S INFORMATION\nFirst Name: %s%nLast Name: %s%nGender: %S%n"
				+ "Date of Birth: %d%nHeight: %.1f in%nWeight: %.1f lb%nAge: %d%nBMI: %.1f%n"
				+ "Maximum Heart Rate: %d bpm%nMaximum Target Heart Rate: %.1f bpm%n"
				+ "Minimum Target Heart Rate: %.1f bpm%n" ,getFirstName(),getLastName(),getGender(),getBirthYear(),getHeight(),getWeight(),getAge(),getBMI(),getMaximumHeartRate(),getMaximumTargetHeartRate(),getMinimumTargetHeartRate());
	//END CODE
	   
	//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!

	   System.out.println("BMI VALUES");
	   System.out.println("Underweight: less than 18.5");
	   System.out.println("Normal:      between 18.5 and 24.9");
	   System.out.println("Overweight:  between 25 and 29.9");
	   System.out.println("Obese:       30 or greater");   
	} 

} // end class MyHealthData

