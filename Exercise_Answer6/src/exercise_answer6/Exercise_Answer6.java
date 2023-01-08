package exercise_answer6;

/**
 *
 * @author tmdan
 */
import java.util.Scanner;
public class Exercise_Answer6 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      //we ask in the console the number of hours worked
      System.out.print("Enter the number of hours worked during the week :  ");
      double totalHours = input.nextDouble();
      
      
      double normalTime = totalHours * 10.0;  // calculation for 40 hours worked
      double maxSalarynormalTime = 400.0;  //we define the maximum salary for 40 hours
      double extraTime = (totalHours -40.0)*15 ;  //calculation of overtime
      double maxSalaryextraTime = extraTime + maxSalarynormalTime; //calculation of the salary with more than forty hours
           
      if (totalHours>40.0)
          
          //If the worker worked more than 40 hours, we display the following on the screen
          System.out.print("Total salary is :" + maxSalaryextraTime);
      else
          
          //If the worker worked less than 40 hours, we display the following on the screen
          System.out.print("Total salary is :" + normalTime);
               
    }
    
}
