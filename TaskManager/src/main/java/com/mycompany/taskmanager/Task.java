/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskmanager;

/**
 *
 * @author ayesh
 */
public class Task {
    private int id;
    private String description;
    public void set_description(String des)
    {
        this.description=des;
    }
    public void setId(int i)
    {
        this.id=i;
    }
    
    public int getId()
    {
        return this.id;
    }
    public String get_description()
    {
        return this.description;
    }
    
}
