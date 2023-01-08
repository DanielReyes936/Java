package excercise_answer4;

/**
 *
 * @author tmdan
 */
import java.util.Scanner;
public class Excercise_Answer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //message is displayed to start the game
        System.out.print("let's play dice If you get a pair you WIN!, otherwise you LOSE!. \n If you are ready press ENTER." + "\n  ");
        String waitForKeypress = input.nextLine(); //input scanner is used for the user to press enter and start the game
        
        int number1 = (int)(Math.random()*6 +1);
        int number2 = (int)(Math.random()*6 +1);
        
                
        if (number1 == number2)  //condition
            
            //if the condition is met the player wins
            System.out.println("YOU WIN!!!");
        else
            
            //The numbers obtained are shown if the player loses
             System.out.print("your one die got a: " + number1 + "\n your two die got a:  " + number2 + "\n  " + "\n YOU LOSE!!!" + "\n -------------");
             
                       
    }
    
}
