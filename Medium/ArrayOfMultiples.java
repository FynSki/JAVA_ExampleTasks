/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medium;

/**
 *
 * Array of Multiples
 * 
 * Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.
 */

import java.util.ArrayList;

public class ArrayOfMultiples {
    
    //public static int[] multArray;
    
    public static int[] CreateArray(int startNo , int length)
    {
        int[] multArray = new int[length];
        for(int x = 0 ; x < multArray.length ; x++)
        {
            multArray[x] = startNo * (x+1);
        }
        
        return multArray;
    }
    
    
    
    public static void main(String[] args) {
        
        int[] newArray = CreateArray(17,6);
        
        for(int i = 0 ; i < newArray.length ; i++ )
        {
            System.out.println("lp: " + i + ": " + newArray[i]);
        }
        
    }
}
