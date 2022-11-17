import java.util.Scanner;

class Main {
  public static void main(String[] args) {

//    // for loop
//    for (int i = 1; i <= 10; ++i) {
//
//      // if value of i is between 4 and 9
//      // continue is executed
//      if (i > 4 && i < 9) {
//        continue;
//      }
//      System.out.println(i);
//    }
//    
//    System.out.println();
//    for (int i = 1; i <= 10; ++i) {
//
//        // if value of i is between 4 and 9
//        // continue is executed
//        if (i > 4 && i < 9) {
//          break;
//        }
//        System.out.println(i);
//      }
    
    double number, sum = 0.0;
    
    // create an object of Scanner
    Scanner input = new Scanner(System.in);

    for (int i = 1; i < 6; ++i) {
      System.out.print("Enter number " + i + " : ");
      // takes input from the user
      number = input.nextDouble();

      // if number is negative
      // continue statement is executed
      if (number <= 0.0) {
        continue;
      }

      sum += number;
    }
    System.out.println("Sum = " + sum);
    input.close();
  }
 }