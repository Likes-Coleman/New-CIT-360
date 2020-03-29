/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coleman
 */
import org.junit.runner.JUnitCore;		
import org.junit.runner.Result;		
import org.junit.runner.notification.Failure;		

/* This class executes Junit4AssertionTest with the following results 
of a success or failure. */
public class TestRunner {				
			public static void main(String[] args) {									
      Result testResult = JUnitCore.runClasses(Junit4AssertionTest.class);					
			for (Failure testFailure : testResult.getFailures()) {							
         System.out.println(testFailure.toString());					
      }		
      System.out.println("Result== " + testResult.wasSuccessful());							
   }		
}