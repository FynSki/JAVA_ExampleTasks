/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medium;

/**
 *
 * There's a great war between the even and odd numbers. 
 * Many numbers already lost their lives in this war and it's your task to end this. 
 * You have to determine which group sums larger: the evens, or the odds. The larger group wins.
 * 
 * Create a function that takes an array of integers, sums the even and odd numbers separately, 
 * then returns the difference between the sum of the even and odd numbers.
 */
public class WarOfNumbers {
    
        public static int odds;
        public static int even;
    
    public static void WarOf(int[] noList)
    {
        odds = 0;
        even = 0;
               
        for(int x = 0 ; x<noList.length ; x++)
        {
            if(noList[x]%2 == 0)
            {
                even = even + noList[x];
            }
            else
            {
               odds = odds + noList[x]; 
            }
        }
    }
    
    
    
    
    public static void main(String[] args) {
        
        int[] tab = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        WarOf(tab);
        
        System.out.println("Even numbers sum: " + even);
        System.out.println("Odd numbers sum: " +odds);
        
        if(even > odds)
        {
            System.out.println(even - odds);
        }
        else
        {
            System.out.println(odds - even);
        }
    }
}
