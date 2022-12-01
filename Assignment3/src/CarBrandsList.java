

//22F Assignment 3: CarBrandsList.java 

// Insert your solution code into this file as instructed in the information document (please read before you start). Hints have been provided on your tasks.
// Insert your javadoc style comments to clearly and thoroughly explain your work.
// Ensure that you retain the names of all methods specifically mentioned in the instructions.
// Note that there are codes inbetween the print statements (see assignment information).


//TO DO: YOUR TASK 1: Add the necessary import statements here.

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CarBrandsList {

	public static void forMethod(LinkedList<String> list) {
		for (int i=0; i < list.size(); i++) {
			System.out.printf("%s ", list.get(i));
		}
	}
	
	public static void printList(LinkedList<String> list1, LinkedList<String> list2) {
		System.out.printf("%nlist is:%n");
		forMethod(list1);
		list2.clear();
	}
	
	public static void upperCase (LinkedList<String> list) {
		System.out.printf("%n%nThis is showing the Car Brands in uppercase letters...%nList is: %n");
		list.replaceAll(String::toUpperCase);
		forMethod(list);
		System.out.printf("%n");
	}
	
	public static void removeItems(LinkedList<String> list, int start, int end)
	   {
		System.out.printf("%nList is: %n");
		list.subList(start, end).clear();   // remove items
	    forMethod(list);
	    System.out.printf("%n");
	}
	
	public static void printReversedList(LinkedList<String> list) {
		Collections.reverse(list);
		forMethod(list);
		System.out.printf("%n");
	}
	
public static void main(String[] args) {
   // add rides to list1
   String[] rides = {"cardillac", "toyota", "suzuki", "chevrolet", "hyundai",  "mercedies", "keke"};
   
   // TO DO: YOUR TASK 2
   LinkedList<String> list1 = new LinkedList<>();
   LinkedList<String> list2 = new LinkedList<>();
   
   // add rides2 to list2
   String[] rides2 = {"volvo", "subaru", "volkswagen", "nissan", "cardillac", "toyota", "honda"};
   
   // TO DO: YOUR TASK 3
   for (String i:rides) {
	   list1.add(i);
   }
      
   for (String i:rides2) {
	   list2.add(i);
   }
   
   // HINT: In the section below you should insert code for method calls in main for each of the sections below.

   // TO DO: YOUR TASK 4
   LinkedList<String> ll1 = new LinkedList<String>(Arrays.asList(rides));
   LinkedList<String> ll2 = new LinkedList<String>(Arrays.asList(rides2));
   
   // TO DO: YOUR TASK 5
   ll1.addAll(ll2);
   
   // TO DO: YOUR TASK 6
   printList(ll1, ll2);
   
   // TO DO: YOUR TASK 7
   upperCase(ll1);
   
   // TO DO: YOUR TASK 8
   System.out.printf("%nDeleting car brands 5 to 7...");
   removeItems(ll1, 4, 6);
   System.out.printf("%nHere is the current list of car brands...%n");
   System.out.printf("List is: %n");
   forMethod(ll1);
   System.out.printf("%n");
   
   // TO DO: YOUR TASK 9
   System.out.printf("%nReversed list:%n");
   printReversedList(ll1);
   // TO DO: YOUR TASK 10  

   System.out.printf("%nSorted car brands in alphabetical order...");


   // TO DO: YOUR TASK 11

   System.out.printf("%nRemoving duplicate car brands...");
   


  // HINT: MORE TO DO: Insert all your methods in this section which includes: 

 // output List contents


 // locate String objects and convert to uppercase


 //locate String objects and eliminate duplicates
 

 // obtain sublist and use clear method to delete sublist items


 // print the list in reverse order
   
   }
}

