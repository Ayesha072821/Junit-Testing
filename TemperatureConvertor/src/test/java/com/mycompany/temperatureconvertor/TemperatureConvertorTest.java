/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.temperatureconvertor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ayesh
 */
public class TemperatureConvertorTest {
    
    public static TemperatureConvertor temperature;
    
    @BeforeEach
    public void setUp() {
        temperature =new TemperatureConvertor();
    }
    
    
    //Test to check the conversion from farenhiet to celcius
    @Test
    
    public void convertToCelcius()
    {
        assertEquals(0.0,temperature.farenheitToCelcius(32));
    }
    
    
    @Test
    public void convertToFarenhiet()
    {
        assertEquals(32.0,temperature.celciusToFarenheit(0.0));
    }
    
    
    @Test
    public void celciusToFarenheit_testexception()
    {
         IllegalArgumentException e= assertThrows(IllegalArgumentException.class,() ->
                {
                    temperature.celciusToFarenheit(-274.15);
                });
        assertEquals("Temperature cannot be below absolute zero(-273.15 C)",e.getMessage());
    
    }
    
    
    
    
    @Test
    public void farenhietToCelcius_testexception()
    {
         IllegalArgumentException e= assertThrows(IllegalArgumentException.class,() ->
                {
                    temperature.farenheitToCelcius(-460.15);
                });
        assertEquals("Temperature cannot be below absolute zero(-459.67 F)",e.getMessage());
    
    }
    
    
    @AfterEach
    public void tearDown() {
        temperature =null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
