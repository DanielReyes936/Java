/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumber;

/**
 *
 * @author tmdan
 */
import java.util.Scanner;
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        int number = (int)(Math.random() * 101); //random number
   
       Scanner input = new Scanner(System.in);
      System.out.println("Guess a number between 0 and 100");
 
      int guess = -1;
     while (guess != number) {
       
       System.out.println("Enter your guess: "); // user number
        guess = input.nextInt();
 
        if (guess == number)
            
         System.out.println("Yes, the number is " + number);
        
        else if (guess > number)
            
         System.out.println("Your number is too high");
       else      
            
            System.out.println("Your number is too low");   
     
     } 
   }
}
