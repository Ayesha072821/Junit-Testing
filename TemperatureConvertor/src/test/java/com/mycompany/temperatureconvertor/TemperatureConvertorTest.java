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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
  
    
    
    
    @ParameterizedTest
    @CsvSource({
        "25.0,77.0",
        "100.0,212.0",
        "0.0,32.0"
        
    })
    public void celciusToFarenhiet(double cel,double faren)
    {
        assertEquals(faren,temperature.celciusToFarenheit(cel));
    
    }
    
    
     @ParameterizedTest
    @CsvSource({
        "77.0,25.0,",
        "212.0,100.0",
        "32.0,0.0"
        
    })
    public void farenhietToCelcius(double faren,double cel)
    {
        assertEquals(cel,temperature.farenheitToCelcius(faren));
    
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
