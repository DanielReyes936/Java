package exercise_answer5;

/**
 *
 * @author tmdan
 */
import java.util.Scanner;
public class Exercise_Answer5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //we obtain the value of money in the client's account
        System.out.print("Enter the amount of money to date in your bank account :  ");
        double ammount = input.nextDouble();
        
        //we obtain the time that the money has in the account
        System.out.print("Enter the number of years the money has been in your account :  ");
        double years = input.nextDouble();
        
        double interest5years = 7.5/100.0 ; //interest rate for a period greater than 5 years
       
        double interestlessthan5years = 4.5/100.0; //interest rate for a period less than 5 years
        
        double acummulatedValue1 = ammount * interest5years ;  //accrued interest with a rate for a period greater than 5 years
        double acummulatedValue2 = ammount * interestlessthan5years;  //accrued interest with a rate for a period of less than 5 years
        double totalAccumulatedamount1 = ammount + acummulatedValue1;  // total accumulated value in a period greater than 5 years
        double totalAccumulatedamount2 = ammount + acummulatedValue2;  //total accumulated value in a period of less than 5 years
        
         
        
        if(years<5) //condition
            
            //period of less than 5 years we display the following information        
            System.out.print("The accumulated Interes value is : " + acummulatedValue2 + " \n Total accumulated amount is :  " + totalAccumulatedamount2); 
        
        
       else  
            
            //period greater than 5 years we display the following information
            System.out.print("The accumulated Interest value is : " + acummulatedValue1 + " \n Total accumulated amount is :  " + totalAccumulatedamount1);       
          
    }
    
}
