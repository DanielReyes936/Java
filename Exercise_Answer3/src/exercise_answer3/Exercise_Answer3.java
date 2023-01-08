/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_answer3;

import java.util.Scanner;

/**
 *
 * @author tmdan
 */
public class Exercise_Answer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //message to start interaction with the user
        System.out.print("Let's start the game, guess the number between 1 and 5, are you ready? \n Enter your whole number between 1 and 5?");
       
        int number2 = input.nextInt(); //value joined user
      
        
        int number1=(int)(Math.random()*5+1); //fx aleatory number
        
        int x= number1; //aleatory number
        int y=number2; // user number
        
        //show the user the random number obtained in the game
        System.out.println("Aleatory number is : " + number1);
        
        if (x==y)
            
            //if the condition is met
            System.out.println("You guessed correctly!");
        
        else
            
            //if the condition is not met
            System.out.println("Sorry, you guessed incorrectly!");
    }
    
}
