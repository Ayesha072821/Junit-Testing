/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperatureconvertor;
import java.text.DecimalFormat;
/**
 *
 * @author ayesh
 */
public class TemperatureConvertor {

    //Method to convert temperature from Celcius to Farenheit
    
    public static double celciusToFarenheit(double celcius)
    {
        if(celcius < -273.15)
        {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero(-273.15 C)");
        }
        return (celcius *9/5)+32;
    }
    
     //Method to convert temperature from Farenheit to Celcius 
    
    public static double farenheitToCelcius(double farenhiet)
    {
        if(farenhiet < -459.67)
        {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero(-459.67 F)");
        }
       
        return ((farenhiet -32)*5/9);
    }
}



