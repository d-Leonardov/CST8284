/*
 * File Name: OrderHandler
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Assignment 2
 * Date: 29.Nov.2022
 * Professor: George Kriger
 */

import java.io.IOException;

public class OrderHandler {
	
	public static void main(String[] args) {
		
		/**
		 * Objects of Exception superclass and IOException subclass
		 */
		Exception exceptionSuper = new Exception(); //In the Throwable hierarchy Exception is superclass of IOException
		IOException ioExceptionSub = new IOException(); //In the Throwable hierarchy IOException is subclass of Exception
		
		/**
		 * Compilation error when trying to catch superclass Exception type before
		 * subclass IOException type.
		 * Below try - catch code should be commented out to avoid a compile error. 
		 */
//		try {
//			throw new Exception();
//		}
//		catch (Exception exception) {
//			System.err.println("Catching " + exception);
//		} 
//		catch (IOException ioException) {
//			System.err.println("Catching " + ioException);
//		}finally {
//			System.out.println("Compilation error");
//		}
		
		/**
		 * Rewriting code to show no compilation error
		 */
		try {
			throw new Exception();
		}
		catch (IOException ioException) {
			System.err.println(ioException + " caught");
		} 
		catch (Exception exception) {
			System.err.println(exception + " caught");
		}
		finally {
			System.err.println("No exception " + IOException.class + " has been caught in this try catch statements");
		}
	}
}
