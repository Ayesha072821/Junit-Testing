/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.systeminfo;

/**
 *
 * @author ayesh
 */
public class SystemInfo {

    public String getOSName()
    {
        return System.getProperty("os.name");
                
    }
    
    public String getJavaVersion()
    {
        return System.getProperty("java.version");
    }
}
