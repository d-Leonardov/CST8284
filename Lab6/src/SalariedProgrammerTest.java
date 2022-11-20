import static org.junit.Assert.*;

import org.junit.Test;

public class SalariedProgrammerTest {

	SalariedProgrammer sp = new SalariedProgrammer("leonardo", "villalobos", "111-11111", 700);
	private static final double EPSILON = 1E-12;
	
	@Test
	public void toStringTest() {
		
		String actual = sp.toString();
		String expected = String.format("%s: %s %s\n%s: %s\n%s: $%,.2f",
				"salaried Programmer", "leonardo", "villalobos", "social security number", 
				"111-11111", "weekly salary", 700.00);
		assertEquals("This method should be revised", expected, actual);
	}
	
	@Test
	public void getPaymentAmountTest() {
		double expected = 700;
		double actual = sp.getPaymentAmount();
		assertEquals(expected, actual, EPSILON);
	}
}
