/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

/**
 *
 * @author ayesh
 */
public class Calculator {

    public int add(int a, int b) {
    return a + b;
  }
    
    //division function
    public double divide(int a, int b){
       if( b==0)
       {
           throw new IllegalArgumentException("Cannot divide by zero!");
       }
        return a/b;
    }
    
    public boolean isEven(int a)
    {
        return ((a%2)==0);
    }
}
