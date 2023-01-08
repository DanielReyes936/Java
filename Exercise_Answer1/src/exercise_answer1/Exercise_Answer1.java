package exercise_answer1;
/**
 * This program tells us if the number entered is odd or even.
 * @author tmdan
 */
import  java.util.Scanner;
public class Exercise_Answer1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //Scanner utilities
       
        
        System.out.println( "Enter a whole number: ");  //input user number
        int number = input.nextInt();
        
        if (number % 2 == 0)  //condition 
            
            //if the program is fulfilled it displays that the number is even
            System.out.println( "The number is EVEN "); 
        else        
            //if the program is fulfilled it displays that the number is odd
            
            System.out.println( "The number is ODD ");
                            
    }
    
}
