/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.envoirnmentvariabletests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

/**
 *
 * @author ayesh
 */
public class EnvoirnmentVariableTest {
    
    @Test 
    @EnabledIfEnvironmentVariable(named="ENVIRONMENT",matches= "development")
    void developmentEnvoirnment()
    {
        System.out.println("This test runs only in the development envoinment");
    }
    
    @Test
    @DisabledIfEnvironmentVariable(named="ENVIRONMENT",matches ="development")
    void productionEnvoirnment()
    {
        System.out.println("This test does not run in the production envoirnment.");
        
    }
    
}
