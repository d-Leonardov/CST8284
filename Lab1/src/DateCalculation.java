/*
 * File Name: DateCalculation
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 1
 * Date: 22.Sep.2022
 * Professor: Justin Martins
 * Class list: Villalobos, User, DateCalculation
 */



import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Class implemented to calculate remaining weeks from the current date until 09th December.
 * (course end date) , and also to calculate remaining months in the year 2022.
 * As per Lab 1 instructions, 1 must be substracted from the weeks calculation result and 1 must be
 * added to the months calculation result.
 * @author Leonardo Villalobos.
 * @see java.time.LocalDate
 * @see java.util.Calendar
 * @version JDK 11.05.15
 */

public class DateCalculation {

	/** 
	* Class constructor.
	*/
	public DateCalculation () {
		//no-argument constructor
	}
	
	/**
	 * Instantiation of LocalDate class from LocalDate library with the current date(now method)
	 */
	LocalDate today = LocalDate.now(); 

	/**
	 * Current day displayed in integer format.
	 */
	private int day = today.getDayOfMonth();
	
	/**
	 * Current month displayed in integer format.
	 */
	private int month = today.getMonthValue()-1;
	
	/**
	 * Current year displayed in integer format.
	 */
	private int year = today.getYear();
  
	/**
	 * Method to get number of weeks until the end of the course.
	 * GregorianCalendar class constructor takes 3 integer arguments with the following format : (yyyy,m,d).
	 * GregorianCalendar has a built-in method to get the week of the year.
	 * Source code retrieved from <a> href:https://coderanch.com/t/369055/java/calculate-weeks-dates</a>
	 */
    public void weeks () {
    	GregorianCalendar initialDate = new GregorianCalendar(year,month,day);
    	GregorianCalendar secondDate = new GregorianCalendar(2022,11,30);
    	GregorianCalendar midDate = new GregorianCalendar(2023,11,30);
    	GregorianCalendar finalDate = new GregorianCalendar(2024,11,18);
 	
    	int totalWeeks = secondDate.get(Calendar.WEEK_OF_YEAR) + midDate.get(Calendar.WEEK_OF_YEAR) +
    			finalDate.get(Calendar.WEEK_OF_YEAR);

    	
    	System.out.println("There are still " + ((totalWeeks - initialDate.get(Calendar.WEEK_OF_YEAR)) - 1) + " weeks till the end of the programm");
	}		    
   
	/**
	 * Method to get number of months remaining in the year 2022.
	 */
    public void months () {
		System.out.println("The number of the remaining months in the year 2022 is " 
							+ ((12 - ++month)+ 1));
	}	
}
