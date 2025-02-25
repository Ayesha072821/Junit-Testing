/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taskmanager;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ayesh
 */
public class TaskManager {

    private Map<Integer,Task> tasks;
    public TaskManager()
    {
        this.tasks=new HashMap<>();
    }
    public void add(Task task)
            
    {
        if(exists(task.getId()))
        {
            throw new IllegalArgumentException("Task with this id already exists.");
       
        }
        tasks.put(task.getId(),task);
    }
    public boolean exists(int id)
    {
     
        return tasks.containsKey(id);
    }
    
    public int countTasks()
    {
        return tasks.size();
    }
    
    
    public void remove_task(Task task)
    {
        tasks.remove(task.getId());
    }
    
    
    public void updateTaskDescription(Task t,String s)
    {
        t.set_description(s);
    }
    
    
    public Task retrieveTask(int id)
    {
        return tasks.get(id);
    }
}
