/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coleman
 */

// Imports the necessary junit extension files.
import static org.junit.Assert.*;
import org.junit.*;

public class JUnitLoanTest {
	private double delta = .25;
	
        // Notifies that the loan JUnit test has started.
	@BeforeClass
	public static void setUp() {
		System.out.println("Starting loan test");
	}
	
        /* This will test if the expected amount equals to 395.12.
        the test will fail if does not match this value. Applies the
        .005 delta amount. */
	@Test
	public void testLoan() {
		JUnitLoan loan = new JUnitLoan(2.5, 30, 100000.00);
		assertEquals(395.12, loan.getMonthlyPayment(), delta);
		assertEquals(142243.52, loan.getTotalPayment(), delta);
	}

        // States when the test finishes.
	@AfterClass
	public static void tearDown() {
		System.out.println("Finished test");
	}
}