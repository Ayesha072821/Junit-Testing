/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.weekdaytests;

import java.time.DayOfWeek;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

/**
 *
 * @author ayesh
 */
public class WeekDayTests {
    
    
    @Test
    @EnabledIf("isWeekDay")
    void weekdays()
    {
        System.out.println("This test runs only on weekdays.");
    }
    
    @Test 
    @DisabledIf("isWeekDay")
    void weekEnds()
    {
        System.out.println("This test runs only on weekends.");
    }
    
    
    private boolean isWeekDay()
    {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        return dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY;
    }
    
}
