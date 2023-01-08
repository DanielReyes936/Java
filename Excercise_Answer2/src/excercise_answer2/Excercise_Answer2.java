package excercise_answer2;

/**
 * This program simulates a game of heads and tails.
 * @author tmdan
 */
import java.util.Scanner;
public class Excercise_Answer2 {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Let's play HEADS or TAILS,are you ready?. If you are, press ENTER");
        String waitForKeypress = input.nextLine();   //for the user to press enter and start the game
        
        int x = (int)(Math.random()*10);  //random number
        
        if (x<5)  //condition
            System.out.println("The result is HEADS");  //if the condition is met the result is HEADS
        
        else 
            System.out.println("The result is TAILS");   //if the condition is not met the result is TAILS
        
              
    }
    
}
