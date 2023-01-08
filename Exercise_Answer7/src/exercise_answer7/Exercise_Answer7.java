package exercise_answer7;

/**
 *
 * @author tmdan
 */
import java.util.Scanner;
public class Exercise_Answer7 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //request department number from the user
        System.out.print("Enter a department number : ");
        int numberDepartment = input.nextInt(); //department number entered
        
        if (numberDepartment>=1 && numberDepartment<=45 ) //condition to see if the department is valid
            
            //if the number is valid, the following message is displayed
         System.out.println("The department number is VALID");
        
        else
            
            //if the number is not valid, the following message is displayed
            System.out.println("The department number is INVALID"); 
        
    }
    
}
