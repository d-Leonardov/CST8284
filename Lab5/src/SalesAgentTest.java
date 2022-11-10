
/**
   This program is the first test for the SalesAgent class including the subclass. Check the lab slides to ensure you include every item required.
*/
public class SalesAgentTest
{  
   public static void main(String[] args)
   {
	//... your code starts here!
	   SalesAgent sa = new SalesAgent("Andrew", 42);
	   SalesAgent sp = new SalesSupervisor("James", 26, "Perth");
//	   SalesAgent sc = new SalesChief("Ndidi", 35, "Ottawa", "Accounting");
	   System.out.println(sa.toString());
	   System.out.println(sp.toString());
//	   System.out.println(sc.toString());
   }
}  