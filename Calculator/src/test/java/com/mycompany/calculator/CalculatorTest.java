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
        int result = underTest.add(2,3);
        
        assertEquals(5,result);
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
    
}
