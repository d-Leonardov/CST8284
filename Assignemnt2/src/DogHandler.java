/*
 * File Name: DogHandler
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Assignment 2
 * Date: 29.Nov.2022
 * Professor: George Kriger
 */

import java.io.IOException;

public class DogHandler {

	/**
	 * SECTION TWO
	 * ExceptionDog and ExceptionPuppy are inner classes of DogHandler
	 * @author Leonardo_Villalobos
	 *
	 */
	class ExceptionDog extends Exception {
	}
	
	class ExceptionPuppy extends ExceptionDog {
	}
	
	/**
	 * Catch ExceptionDog
	 * @throws ExceptionDog
	 */
	public void throwExceptionDog() throws ExceptionDog {
		try {	
			throw new ExceptionDog();
		} catch (Exception exception) {
			System.err.println(exception + " has successfully been caught");
		}	
	}
	
	/**
	 * Catch ExceptionPuppy
	 * @throws ExceptionPuppy
	 */
	public void throwExceptionPuppy() throws ExceptionPuppy {
		try {	
			throw new ExceptionPuppy();
		} catch (Exception exception) {
			System.err.println(exception + " has successfully been caught");
		}
	}
	
	/**
	 * Catch NullPointerException
	 * @throws NullPointerException
	 */
	public void nullPointerExceptionMethod() throws NullPointerException{
		try {	
			throw new NullPointerException(" has successfully been caught");
		} catch (Exception exception) {
			for (int i = 10 ; i < exception.getClass().getName().length(); i ++) {
				System.err.print(exception.getClass().getName().charAt(i));
			}
			System.err.println(exception.getMessage());
		}
	}
	
	/**
	 * Catch IOException  
	 * @throws IOException
	 */
	public void ioExceptionMethod() throws IOException {
		try {
			throw new IOException(" has successfully been caught");
		}
		catch(Exception exception)
		{
			for (int i = 8 ; i < exception.getClass().getName().length(); i ++) {
				System.err.print(exception.getClass().getName().charAt(i));
			}
			System.err.println(exception.getMessage());
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		/**
		 * Instance of DogHandler class
		 */
		DogHandler dogHandler = new DogHandler();
		
		/**
		 * Calling 4 exception methods
		 */
		dogHandler.throwExceptionDog();
		dogHandler.throwExceptionPuppy();
		dogHandler.nullPointerExceptionMethod();
		dogHandler.ioExceptionMethod();	
	}
}



