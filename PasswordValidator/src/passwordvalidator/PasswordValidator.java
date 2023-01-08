package passwordvalidator;

import java.util.Scanner;

/**
 * A class to validate a user's chosen password.
 * The password must have a length of at least 8
 * at least one uppercase character and at least one
 * special character (character that is not a letter or number).
 * This is also our class under test.
 * 
 * @author Megha Patel
 * @author Daniel Reyes
 */
public class PasswordValidator 
{

    /**
     * Main method cycles through our static utility methods
     * to determine whether the password is valid or not.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isValid=false;
        do
        {
            System.out.println("Please enter a VALID password, password must have:");
            System.out.println("A length of at least 8");
            System.out.println("At least one special character");
            System.out.println("At least one uppercase letter");
            Scanner sc = new Scanner(System.in);
            String pass = sc.nextLine();
            if ((checkLength(pass))&&(checkUppercaseChars(pass))&&(checkspecialChars(pass)))
            {
               isValid=true;
            }
            
        }while(!isValid);
        System.out.println("Valid password, accepted!");
    }
    
    /**
     * A method to check whether a password is at least length 8
     * @param pass - the String to check
     * @return true if length is greater than or equals to 8 and false otherwise
     */
    public static boolean checkLength(String pass)
    {
                if(pass.length()>=8)
                {
                 return true;
                }
            return false;
        }
    //We evaluate if the entered password has a capital letter
    public static boolean checkUppercaseChars(String pass){
        
        String upperCaseChars = "(.*)[A-Z](.*)";
                if (pass.matches(upperCaseChars ))
                {
                    return true;
                }
            return false;
        }
    
    //we evaluate whether the entered password contains special characters described
    public static boolean checkspecialChars(String pass){
        String specialChars = "(.*)[*,+,@,#,$,%,/](.*)";  
                if (pass.matches(specialChars ))
                {
                return true;
                }
        return false;
    }
    
}


