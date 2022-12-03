/*
 * File Name: CarBrandsList
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Assignment 3
 * Date: 02.Dec.2022
 * Professor: George Kriger
 */

//22F Assignment 3: CarBrandsList.java 

// Insert your solution code into this file as instructed in the information document (please read before you start). Hints have been provided on your tasks.
// Insert your javadoc style comments to clearly and thoroughly explain your work.
// Ensure that you retain the names of all methods specifically mentioned in the instructions.
// Note that there are codes inbetween the print statements (see assignment information).


//TO DO: YOUR TASK 1: Add the necessary import statements here.

import java.util.Arrays;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * CarBrandsList Class holds all methods required in Assignment3
 * @author Daniel_Villalobos
 *
 */
public class CarBrandsList {
	
	/**
	 * This method takes the a LinkedList object as parameter and prints
	 * all the elements in the Array "list"
	 * @param list LinkedList object
	 */
	public static void forMethod(LinkedList<String> list) {
		for (int i=0; i < list.size(); i++) {
			System.out.printf("%s ", list.get(i));
		}
	}
	
	/**
	 * This method takes the two LinkedList objects as parameter and prints
	 * all the elements in both Arrays "list1" and "list2"
	 * @param list1 LinkedList object
	 * @param list2 LinkedList object
	 */
	public static void printList(LinkedList<String> list1, LinkedList<String> list2) {
		System.out.printf("%nlist is:%n");
		forMethod(list1);
		list2.clear();
	}
	
	/**
	 * This method takes the a LinkedList object as parameter and prints
	 * set all the elements of Array "list1" in uppercase
	 * @param list LinkedList object
	 */
	public static void upperCase (LinkedList<String> list) {
		System.out.printf("%n%nThis is showing the Car Brands in uppercase letters...%nList is: %n");
		list.replaceAll(String::toUpperCase);
		forMethod(list);
		System.out.printf("%n");
	}
	
	/**
	 * This method takes a LinkedList object as parameter and removes
	 * elements of Array "list1" from a given start point to a given end point
	 * @param list LinkedList object
	 * @param start initial point int 
	 * @param end end point int
	 */
	public static void removeItems(LinkedList<String> list, int start, int end)
	   {
		System.out.printf("%nList is: %n");
		list.subList(start, end).clear();   // remove items
	    forMethod(list);
	    System.out.printf("%n");
	}
	
	/**
	 * This method takes a LinkedList object as parameter and reverses the order of elements
	 * in the Array 
	 * @param list LinkedList object
	 */
	public static void printReversedList(LinkedList<String> list) {
		Collections.reverse(list);
		forMethod(list);
	}
	
	/**
	 * This method takes a LinkedList object as parameter and removes duplicate elementes
	 * of the Array "list"
	 * @param list LinkedList object
	 * @return LinkedList object of type String
	 */
	public static LinkedList<String> printNonDuplicates(LinkedList<String> list) { 
	    LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.addAll(list); //Adds non-duplicated elements from LinkedList "list" into a LinkedHashSet object
        list.clear(); //Removes all elements from LinkedList "list"
        list.addAll(lhs); //Adds non-duplicated elements from LinkedHashSet "lhs" into LinkedList "list"
        forMethod(list); //Prints non-duplicated elements to console
        return list;
	}

	/**
	 * main method of CarBrandsList Class
	 * @param args String args parameter inside main method
	 */
public static void main(String[] args) {
   
   // add rides to list1
   String[] rides = {"cardillac", "toyota", "suzuki", "chevrolet", "hyundai",  "mercedies", "keke"};
   
   // TO DO: YOUR TASK 2
   /**
    * Two LinkedList objects created "list1" and "list2"
    */
   LinkedList<String> list1 = new LinkedList<>();
   LinkedList<String> list2 = new LinkedList<>();
   
   // add rides2 to list2
   String[] rides2 = {"volvo", "subaru", "volkswagen", "nissan", "cardillac", "toyota", "honda"};
   
   /**
    * Adds the contents of rides into list1 and rides2 into list2
    */
   // TO DO: YOUR TASK 3
   for (String i:rides) {
	   list1.add(i);
   }
      
   for (String i:rides2) {
	   list2.add(i);
   }
   
   // HINT: In the section below you should insert code for method calls in main for each of the sections below.
      
   // TO DO: YOUR TASK 4
   /**
    * Two objecs LinkedList created "ll1" and "ll2"
    * This objects takes 
    */
   LinkedList<String> ll1 = new LinkedList<>(Arrays.asList(rides));
   LinkedList<String> ll2 = new LinkedList<>(Arrays.asList(rides2));
   
   // TO DO: YOUR TASK 5
   /**
    * Adds elements in list2 to list1
    */
   ll1.addAll(ll2);
   
   // TO DO: YOUR TASK 6
   /**
    * Prints updated content of list1 and clears contents of list2
    */
   printList(ll1, ll2);
   
   // TO DO: YOUR TASK 7
   /**
    * Converts all the elements in list1 to uppercase and prints output to console
    */
   upperCase(ll1);
   
   // TO DO: YOUR TASK 8
   /**
    * Deletes elements in position 5 to 7 from Linkedlist "ll1"
    */
   System.out.printf("%nDeleting car brands 5 to 7...");
   removeItems(ll1, 5, 8);
   
   System.out.printf("%nHere is the current list of car brands...%n");
   System.out.printf("List is: %n");
   forMethod(ll1);
   System.out.printf("%n");
   
   
   // TO DO: YOUR TASK 9
   /**
    * Print the list ll1 in reversed order
    */
   System.out.printf("%nReversed list:%n");
   printReversedList(ll1);
   System.out.printf("%n");
   
   // TO DO: YOUR TASK 10  
   /**
    * Sorts the elements of ll1 in alphabetical order
    */
   System.out.printf("%nSorted car brands in alphabetical order...%n");
   System.out.printf("List is: %n");
   Collections.sort(ll1);
   forMethod(ll1);

   /**
    * Remove 
    */
   // TO DO: YOUR TASK 11
   System.out.printf("%n%nRemoving duplicate car brands...%n");
   System.out.printf("Non-duplicates are: ");
   printNonDuplicates(ll1);
   
  // HINT: MORE TO DO: Insert all your methods in this section which includes: 

 // output List contents
 /*
  * 	public static void printList(LinkedList<String> list1, LinkedList<String> list2) {
		System.out.printf("%nlist is:%n");
		forMethod(list1);
		list2.clear();
	}
  */

 // locate String objects and convert to uppercase
 /*
  * 	public static void upperCase (LinkedList<String> list) {
		System.out.printf("%n%nThis is showing the Car Brands in uppercase letters...%nList is: %n");
		list.replaceAll(String::toUpperCase);
		forMethod(list);
		System.out.printf("%n");
	}
  */

 //locate String objects and eliminate duplicates
 /*
  * 	public static LinkedList<String> printNonDuplicates(LinkedList<String> list) { 
	    LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.addAll(list);
        list.clear(); 
        list.addAll(lhs); 
        return list;
	}
  */

 // obtain sublist and use clear method to delete sublist items
/*
 * 	public static void removeItems(LinkedList<String> list, int start, int end)
	   {
		System.out.printf("%nList is: %n");
		list.subList(start, end).clear();   // remove items
	    forMethod(list);
	    System.out.printf("%n");
	}
 */

 // print the list in reverse order
/*
 * 	public static void printReversedList(LinkedList<String> list) {
		Collections.reverse(list);
		forMethod(list);
		System.out.printf("%n");
	}
 */
   }
}

