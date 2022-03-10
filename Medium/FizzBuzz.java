/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

/**
 *
 * @author JANISAD1
 */
public class FizzBuzz {
    
    public static void FizzBuzz(int provRange){
        
        for(int x = 1 ; x <= provRange ; x++)
        {
            if(x%3 == 0 & x%5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(x%3 == 0)
                {
                    System.out.println("Fizz");
                }
            else if(x%5 == 0)
            {
                System.out.println("Buzz");
            }
            else 
            {
                System.out.println(x);
            }
        }
    }
    
    
    public static void main(String[] args) {
        FizzBuzz(15);
    }
}
