/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

/**
 *
 * Create a function that takes a number as an argument, increments the number by +1 and returns the result.
 * 
 * 
 * 
 * 
 */
public class ReturntheNextNumber {
    
    public static int NextInt(int a)
    {
        return ++a;
    }
    
    
    
    public static void main(String[] args) {
        
        int c = NextInt(2);
        
        System.out.println(c);
        
    }
}
