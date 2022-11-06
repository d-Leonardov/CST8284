/*
 * File Name: CovidStatistics
 * Author: Leonardo Villalobos, 41055793
 * Course: CST8132 - OOP
 * Assignment: Lab 2
 * Date: 23.Sep.2022
 * Professor: Justin Martins
 */

/**
* TASK: Remember to include all necessary headers for your Javadoc, descriptions and explanations of what you have done 
* in the appropriate places.
* ENSURE that you add appropriate Javadoc style comments to relevant parts of this code as you update this program to 
* show that you understand it.
* @author Leonardo Villalobos
*/

/**
 * This class shows the number of patients who have recovered from COVID from Feb to Sep 2020 
 * across seven provinces in Canada.
 * Sums of recovered people for each month is also displayed.
 * Output should match CovidSample text file.
 * @author Leonardo Villalobos
 * @version JDK 11.05.15
 * @see java.io.PrintStream
 */
public class CovidStatistics {
	
	/**
	 * @param args
	 * Default main method
	 */
	public static void main(String[] args) {
		final int ROWS = 7;
		final int COLUMNS = 8;
		
		/**
		 * 2D integer array created with [7]rows[8]columns, each element of this array represents the number of people recovered from COVID
		 * for each month across seven provinces.
		 */
		
	    int[][] patients = 
	      { 
	         {  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
	         {  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
	         {  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
	         {  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
	         {  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
	         {  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
		     {  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }
	         
	      };
	    
	    /**
	     * String array that holds 7 provinces for the report.
	     */
	    String[] provinces = 
	      { 
	         "Ontario", 
	         "Quebec", 
	         "Nova Scotia",
	         "New Brunswick", 
	         "Manitoba", 
	         "British Columbia",
		     "Prince Edward Island"         
	      };
	    
	    /**
	     * Calls printf method to format Strings
	     * @param String formats, Objects / args
	     * %s: formats strings 
	     * %n: insert a line separator
	     * %(number): adds spacing
	     */
	    System.out.printf("%20s %6s %9s %7s %5s %8s %7s %6s %8s%n", "Month", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept");
	    System.out.println();
	    
	    /** TASK: It is important to know the number of spice traders per city. So you need to print out the number 
	     * of traders for all cities (content of the array) for each month.
	     * Update the code in this section by using a nested for loop. 
	     */
	   
	    // TO DO: WRITE YOUR CODE FOR THIS SECTION HERE!!!! 
	    // Check the sample output file (SpiceOutput) to see the expected pattern to print out these details using printf.
	    for (int i=0; i < ROWS; i++ ) {
	    		System.out.printf("%20s",provinces[i]);
	    	for (int j=0; j < COLUMNS; j++ ) {
	    		System.out.printf("%8d" ,patients[i][j]);
	    		}
	    	System.out.println();
	    }
	    
	    
	  /** TASK: Update the code in this section by writing a nested for loop (for the columns and rows of the array) 
	    * to compute the sum (column). 
	   	* Print the column sum using printf. Check the sample output file (SpiceOutput) to see the expected pattern.
	   	*/ 
	    // TO DO: INSERT CODE HERE FOR THIS SECTION!!! Check the sample output file (SpiceOutput) to see the expected pattern.
	    System.out.println();
	    System.out.printf("%20s","Recovered Patients");

	    for(int i = 0; i < COLUMNS; i++){  
	    	int columnSum = 0;
	    	for(int j = 0; j < ROWS; j++){  
	    		columnSum = columnSum + patients[j][i];  
	    	}  
	       System.out.printf("%8d",columnSum);
	    }  
	   
	    System.out.println(); 
	    System.out.println(); 
	    System.out.println("               Vaccinate and maintain good health practices!" );
	}
}