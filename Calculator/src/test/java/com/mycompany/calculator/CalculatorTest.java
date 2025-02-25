/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ayesh
 */
public class CalculatorTest {
    
    private Calculator underTest =new Calculator();
    
    //Test Add
    
    @Test
    public void addition()
    {
        double result = underTest.add(2,3);
        
        assertEquals(5,result,"Verify basic addition and result should be five");
    }
    
    
    
    @Test
    public void division()
    {
        double divisionResult =underTest.divide(6,3);
        assertEquals(2,divisionResult);
    }
    
    
    @Test
    public void Even()
    {
        boolean result=underTest.isEven(4);
        assertTrue(result);
    }
   
    @Test
    public void isnoteven()
    {
        boolean result=underTest.isEven(7);
        assertFalse(result);
    }
    
    
    //assertNull
    //assertNotNull
    
    @Test
    public void divideByZero(){
       
        IllegalArgumentException e= assertThrows(IllegalArgumentException.class,() ->
                {
                    underTest.divide(6, 0);
                });
        assertEquals("Cannot divide by zero!",e.getMessage());
    }
    
    
    @Test
    void divideNonZero()
    {
        Double result=underTest.divide(9, 3);
        assertNotNull(result);
        assertEquals(3,result);
    }
}
