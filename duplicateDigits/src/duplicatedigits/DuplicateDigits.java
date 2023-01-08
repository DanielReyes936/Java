package duplicatedigits;

import java.util.Scanner;

public class DuplicateDigits {
    
    public static void main(String[] args) {
         // the input stream opens
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter a number:   ");//user input a number
        long dupli = input.nextLong();
        
        DuplicateDigits x = new DuplicateDigits(); //create a objet the class
        
        long res = x.duplicateDigits(dupli);
        
        System.out.println("The new number is: " + res); //output new number 
    }
    
    public long duplicateDigits(long n){  //contructed new method long n
    long dupli = n;
    long reverse =0;
    
    while(n!=0){
    reverse = reverse *10 + n%10;     //reverse the numbernumber
    n = n/10;}
    
    while (reverse!=0){
    dupli = dupli*10 + reverse%10;
    reverse = reverse/10;
}
    return dupli;  //return number
    }
 }
