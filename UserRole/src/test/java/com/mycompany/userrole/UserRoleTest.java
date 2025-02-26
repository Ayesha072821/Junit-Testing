/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.userrole;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/**
 *
 * @author ayesh
 */
public class UserRoleTest {
    
    
    @ParameterizedTest
    @EnumSource(value=UserRole.class,names={"ADMIN","MODERATOR"})
    public void rolesWithWritePermission(UserRole role)
    {
        assertTrue(role.hasWritePermission());
    }
    
    @ParameterizedTest
    @EnumSource(value=UserRole.class,names={"USER","GUEST"})
    public void rolesWithNoWritePermission(UserRole role)
    {
        assertFalse(role.hasWritePermission());
    }
    
    /*@Test
    void moderatorHasWritePermission()
    {
        UserRole role =UserRole.MODERATOR;
        assertTrue(role.hasWritePermission());
    }
    
    @Test
    void userHasNoWritePermission()
    {
        UserRole role =UserRole.USER;
        assertFalse(role.hasWritePermission());
    }
    
    @Test
    
     void guestHasNoWritePermission()
    {
        UserRole role =UserRole.GUEST;
        assertFalse(role.hasWritePermission());
    }
   */
}
