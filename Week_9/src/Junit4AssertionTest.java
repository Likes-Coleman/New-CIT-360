/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coleman
 */
import static org.junit.Assert.*;				
import org.junit.Test;		

// This tests for different assert statements methods in Strings for JUnit.
public class Junit4AssertionTest {				

    @Test		
    public void testAssert(){					
        		
        //Declares 7 Strings for the assert methods.		
        String string1 = "Junit";					
        String string2 = "Junit";					
        String string3 = "test";					
        String string4 = "test";					
        String string5 = null;	
        String string6 = null;
        String string7 = "notnull";
 
        int variable1 = 1;					
        int variable2 = 2;					
        int[] airethematicArrary1 = { 1, 2, 3 };					
        int[] airethematicArrary2 = { 1, 2, 3 };					
        		
        // 9 different types of assert statements testing Strings and variables.		
        assertEquals(string1,string2);					
        assertSame(string3, string4);					
        assertNotSame(string1, string3);
        assertNotEquals(string1, string3);
        assertNotNull(string1);			
        assertNull(string5);			
        assertTrue(variable1<variable2);
        assertFalse(string6==string7);
        assertArrayEquals(airethematicArrary1, airethematicArrary2);					
    }		
}