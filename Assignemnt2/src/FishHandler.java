/*
 * File Name: FishHandler
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Assignment 2
 * Date: 29.Nov.2022
 * Professor: George Kriger
 */

public class FishHandler {
	
	/**
	 * SECTION THREE
	 * @throws Exception
	 */
	public void easterEnding() throws Exception{
		throw new Exception();
	}
	
	/**
	 * This method invokes ExceptionPuppy exception, catches it and then rethrows it
	 * @throws Exception
	 */
	public void easterStarting() throws Exception{
		try {
			easterEnding();
		} catch (Exception exception) {
			System.err.println("Catching thrown " + exception);
			throw exception;
		}
	}
	
	public static void main(String[] args) {
		
		/**
		 * Instance of FishHandler class
		 */
		FishHandler fishHandler = new FishHandler();
		
		/**
		 * This try-catch statement invokes easterStarting method and catches the
		 * rethrown exception.
		 */
		try {
			fishHandler.easterStarting();
		} catch (Exception exception) {
			System.err.print("Catching rethrown ");
			exception.printStackTrace();
		}
	}
}
