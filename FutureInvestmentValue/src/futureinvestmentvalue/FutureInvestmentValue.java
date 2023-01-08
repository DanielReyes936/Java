package futureinvestmentvalue;
import java.util.Scanner;   //this section import Scanner.
/**
 * This program is to calculate the future investment value that it delivers one inversion.
 * @author tmdan
 */
public class FutureInvestmentValue {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Investment Amount = ");
        double invAmount = input.nextDouble (); //At this point we will obtain the value of the initial investment amount.
        
        System.out.print("Enter number of Years = ");
        int numYears = input.nextInt ();        // At this point we will obtain the value of the number years.
        
        System.out.print("Enter Annual Interest rate = ");
        double rateInterestAnnual = input.nextDouble ();
        
                
        // declaration of our variables
        double numMonthly = numYears * 12.0;  // calculation of number of months
        
        double interestAnnual = rateInterestAnnual / 100.0;    //annual interest percentage calculation
        
        double monthlyInteresRate = interestAnnual / 12.0 ;   // calculation of monthly interest      
                
        double accumulatedValue = invAmount * Math.pow( 1.0 + monthlyInteresRate ,numMonthly);   //with this calculation we will obtain our accumulated value
            
            //output elements
       
            System.out.println("----------------------------------------");
            System.out.print(" Invest Amount : " + invAmount + 
                "\n Anual Interest Rate : " + rateInterestAnnual + " %" + 
                "\n Number of Years : " + numYears );
                            
            System.out.printf("\n Accumulated Value : %.2f", accumulatedValue);
            System.out.print("\n ---------------------------------------");
    }
}
