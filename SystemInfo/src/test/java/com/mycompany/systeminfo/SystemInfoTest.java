/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.systeminfo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

/**
 *
 * @author ayesh
 */
public class SystemInfoTest {
    
    private final SystemInfo systeminfo=new SystemInfo();
    
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void getOsNameOnWindows()
    {
        String osName =systeminfo.getOSName();
        assertTrue(osName.contains("Windows"),"OS name should contain windows.");
    }
    
    
    @Test
    @EnabledOnOs(OS.LINUX)
    void getOsNameOnLinux()
    {
        String osName =systeminfo.getOSName();
        assertTrue(osName.contains("Linux"),"OS name should contain 'Linux'");
    }
    
    
    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void getJavaVersionOnJava11()
    {
        String javaVersion =systeminfo.getJavaVersion();
        assertTrue(javaVersion.startsWith("11"),"Java version should start with '11'");
    }
    
    @Test
    @EnabledOnOs(OS.MAC)
    @EnabledOnJre(JRE.JAVA_17)
    void getOSNameOnMacWithJava17()
    {
        String osName =systeminfo.getOSName();
        String javaVersion = systeminfo.getJavaVersion();
        assertTrue(osName.contains("Mac"),"OS name should contain 'MAC'");
        assertTrue(javaVersion.startsWith("17"),"Java version should start with '17'");
    }
}
