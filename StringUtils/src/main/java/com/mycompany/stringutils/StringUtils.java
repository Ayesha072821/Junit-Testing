/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringutils;

/**
 *
 * @author ayesh
 */
public class StringUtils {

    public static boolean isPalindrome(String str)
    {
        if(str==null)
        {
            return false;
        }
        String cleanedStr =str.replaceAll("[\\W]", "").toLowerCase();
        int length=cleanedStr.length();
        for(int i=0;i<length/2;i++)
        {
            if(cleanedStr.charAt(i)!=cleanedStr.charAt(length-1-i))
            {
                return false;
            }
        }
        return true;
    }
}
