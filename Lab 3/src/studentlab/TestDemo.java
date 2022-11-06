/*
 * File Name: TestDemo
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 3
 * Date: 02.Oct.2022
 * Professor: Justin Martins
 */

package studentlab;
import fall22lab3.EventSchedule;

/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Leonardo Villalobos.
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	
	/*
	 *  YOUR TASK: COMPLETE THE CODE FOR THIS DRIVER CLASS NAMED TestDemo.
	 *  Hint:  See the SampleOutput file provided for the print statements required.
	 */
	public static void main(String[] args) {

	/*
	 *  YOUR CODE STARTS HERE
	 */
		System.out.printf("Just creating 4 EventSchedules%n%n");
		
		System.out.println("EventSchedule1");
		EventSchedule event1 = new EventSchedule();
		System.out.println(event1.createReport());
		
		System.out.println("EventSchedule2");
		EventSchedule event2 = new EventSchedule(2023);
		System.out.println(event2.createReport());
		
		System.out.println("EventSchedule3");
		EventSchedule event3 = new EventSchedule(2023,12);
		System.out.println(event3.createReport());
		
		System.out.println("EventSchedule4");
		EventSchedule event4 = new EventSchedule(2023,12,15);
		System.out.println(event4.createReport());
	
	/*
	 *  YOUR CODE ENDS HERE
	 */
	}

}
