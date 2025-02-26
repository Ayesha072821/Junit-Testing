/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.userrole;

/**
 *
 * @author ayesh
 */
public enum UserRole{
    ADMIN,MODERATOR,USER,GUEST;
    
    public boolean hasWritePermission()
    {
        switch(this)
        {
            case ADMIN:
            case MODERATOR:
                return true;
            case USER:
            case GUEST:
                return false;
            default:
                throw new IllegalArgumentException("Unknown role: "+this);
                
        }
    }
}
