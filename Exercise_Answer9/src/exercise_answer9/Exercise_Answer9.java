package exercise_answer9;

import java.util.Scanner;

/**
 *This program indicates if a department number is valid
 * @author tmdan
 */
public class Exercise_Answer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        //request department number from the user
        System.out.print("Enter a department number : ");
        int numberDepartment = input.nextInt(); //department number entered
        
        if (numberDepartment>=1 && numberDepartment<=45 ||numberDepartment>200 ||numberDepartment==50) //condition to see if the department is valid
            
            //if the number is valid, the following message is displayed
         System.out.println("The department number is VALID ! ");
        
        else
            
            //if the number is not valid, the following message is displayed
            System.out.println("The department number is INVALID ! ");
    }
    
}
