package videostore;

import java.util.Scanner;

/**
 *
 * @author tmdan
 */
public class VideoStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner rewards = new Scanner(System.in);
        
        //user enter number of DVDs
        
        System.out.println("Enter number of DVDs");
        
        int numDVDs = input.nextInt();
        
        //user mentions if it is associated or not Y / N
        
        System.out.print("\nIs Customer in Rewards Program  Y/N");
              
        String rewardsMember = rewards.nextLine();
        
        
        //condition if you are a member and rent less than 4 DVDs
            double subTotal;
            if (rewardsMember == "Y" && numDVDs<=4 ){
                
                
             subTotal = numDVDs * 3.59;}
             
             //condition if you are a member and rent more than 4 DVDs
             
            else if ( rewardsMember == "Y" && numDVDs>=4){
                 subTotal = numDVDs * 3.59;}

            //condition if you are not a member and rent less than 4 DVDs
            
            else if (rewardsMember != "Y" && numDVDs<= 4)
                 subTotal = (numDVDs * 4.59);
             
                         
              //condition if you are not a member and rent more than 4 DVDs         
            else 
                 subTotal = (numDVDs * 3.99);
            
            System.out.println("Sub Total : " + subTotal);
                   
    }
}    
    

