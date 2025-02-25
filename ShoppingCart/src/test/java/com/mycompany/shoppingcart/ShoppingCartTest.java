/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.shoppingcart;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ayesh
 */
public class ShoppingCartTest {
    
    private static ShoppingCart cart;
    
    
    @BeforeEach
    
    public void setUp()
    {
        cart=new ShoppingCart();
        
    }
    
   
    
    @Test
    public void addItem()
    {
        cart.addItem("Product A",2);
        cart.addItem("Product C",3);
        assertEquals(5,cart.getTotalItems());
    }
    
    
    @Test
    public void removeItem()
    {
        cart.addItem("Product A",2);
        cart.removeItem("Product A", 1);
        assertEquals(1,cart.getTotalItems());
    }
    
    
     
    @AfterEach
    
    public void teardown()
    {
        cart = null;
    }

}
