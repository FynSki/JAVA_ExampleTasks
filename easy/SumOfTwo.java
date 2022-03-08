/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

/**
 *
 * Create a method that takes two integers as arguments and returns their sum.
 * 
 * 
 * 
 */
public class SumOfTwo {
    
    public SumOfTwo()
    {
        
    }
    
    public static int SumOfTwo(int a , int b)
    {
        int c = a + b;
        return c;
    }
    
    public static void main(String[] args) {
        int sumOf = SumOfTwo(5 , 2);
        
        System.out.println(sumOf);
    }
    
    
    
}
