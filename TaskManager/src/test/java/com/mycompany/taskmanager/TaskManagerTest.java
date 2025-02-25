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
public class TaskManagerTest {
    
  @Test
  public void addTask()
  {
      TaskManager taskManager =new TaskManager();
      Task task =new Task();
      task.setId(2);
      taskManager.add(task);
      assertTrue(taskManager.exists(task.getId()));
  }
  
  @Test
   public void addTask_duplicateTasks()
    {
        TaskManager taskmanager=new TaskManager();
        Task task1=new Task();
        Task task2=new Task();
        task1.setId(1);
        task1.set_description("do laundry");
        task2.setId(2);
        task2.set_description("go shopping");
        taskmanager.add(task1);
        taskmanager.add(task2);
        assertTrue(taskmanager.exists(task1.getId()));
        assertTrue(taskmanager.exists(task2.getId()));
        
        
        IllegalArgumentException e= assertThrows(IllegalArgumentException.class,() ->
                {
                    taskmanager.add(task1);
                });
        assertEquals("Task with this id already exists.",e.getMessage());
    
        
        assertEquals(2,taskmanager.countTasks());
        
        
        
        
    }
   
   @Test
   public void remove_task()
   {
       TaskManager taskmanager=new TaskManager();
        Task task1=new Task();
        Task task2=new Task();
        task1.setId(1);
        task1.set_description("watch movie");
        task2.setId(2);
        task2.set_description("learn java");
        taskmanager.add(task1);
        taskmanager.add(task2);
        taskmanager.remove_task(task1);
        assertEquals(1,taskmanager.countTasks());
        assertFalse(taskmanager.exists(task1.getId()));
   }
   
   @Test
   public void updateTestDescription()
   {
       TaskManager taskmanager=new TaskManager();
        Task task1=new Task();
        Task task2=new Task();
        task1.setId(1);
        task1.set_description("watch movie");
        task2.setId(2);
        task2.set_description("learn java");
        taskmanager.updateTaskDescription(task1, "go to party");
        taskmanager.updateTaskDescription(task2, "meet a friend");
        assertEquals("go to party",task1.get_description());
        assertEquals("meet a friend",task2.get_description());
        
       
   }
   
   @Test 
   public void retrieve_Task()
   {
       TaskManager taskmanager=new TaskManager();
        Task task1=new Task();
        Task task2=new Task();
        task1.setId(1);
        task1.set_description("watch movie");
        task2.setId(2);
        task2.set_description("learn java");
        taskmanager.add(task1);
        taskmanager.add(task2);
       Task result=taskmanager.retrieveTask(1);
       assertEquals(task1,result);
       
   }
   
   
  
}
