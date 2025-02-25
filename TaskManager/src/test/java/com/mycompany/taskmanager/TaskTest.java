/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.taskmanager;

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
public class TaskTest {
    
    @Test
    public void getId()
    {
        Task task=new Task();
        task.setId(3);
        assertEquals(3,task.getId());
        
    }
    @Test
    public void getDescription()
    {
        Task t=new Task();
        t.setId(1);
        t.set_description("read a book");
        
        assertEquals("read a book",t.get_description());
    }
    
  
}
