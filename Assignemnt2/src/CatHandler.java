/*
 * File Name: CatHandler
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Assignment 2
 * Date: 29.Nov.2022
 * Professor: George Kriger
 */

public class CatHandler {

	/**
	 * SECTION ONE
	 * ExceptionAlpha, ExceptionBeta, ExceptionGammer are inner classes of CatHandler
	 * @author Leonardo_Villalobos
	 *
	 */
	class ExceptionAlpha extends Exception {
	}
	
	class ExceptionBeta extends ExceptionAlpha {
	}
	
	class ExceptionGammer extends ExceptionBeta {
	}

	public static void main(String[] args) {
		
		/**
		 * Instance of CatHandler class
		 */
		CatHandler catHandler = new CatHandler();
		
		/**
		 * This try-code statement catches ExceptionBeta and calls printStackTrace method
		 */
		try {
			throw catHandler.new ExceptionBeta();
		} catch (ExceptionAlpha exceptionAlpha) {
			System.err.print("Catching: ");
			exceptionAlpha.printStackTrace();
		}
		
		/**
		 * This try-code statement catches ExceptionGammer and calls printStackTrace method
		 */
		try {
			throw catHandler.new ExceptionGammer();
		}catch (ExceptionAlpha exceptionAlpha) {
			System.err.print("Catching: ");
			exceptionAlpha.printStackTrace();
		}
	}
}



