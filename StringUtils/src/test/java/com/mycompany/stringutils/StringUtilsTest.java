/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.stringutils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author ayesh
 */
public class StringUtilsTest {
    
    @ParameterizedTest
    @ValueSource(strings={"","a","racecar","RaCeCar"})
    public void isPlindrome(String str)
    {
        assertTrue(StringUtils.isPalindrome(str));
    }
    
    
    @ParameterizedTest
    @ValueSource(strings={"hello","get","java"})
    public void isnotPlindrome(String str)
    {
        assertFalse(StringUtils.isPalindrome(str));
    }
}
