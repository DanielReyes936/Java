package exercise_answer10;
import java.util.Scanner;
/**
 *
 * @author tmdan
 */
public class Exercise_Answer10 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your marital status using the assigned number : \n single filers 0, \n married filing jointly 1, \n married filing separately 2, \n head of household 3.  \n What is the Marital Status ? ");
       int maritedStatus = input.nextInt();
       
       System.out.print(" \n Enter your personal income : ");
       double personalIncome = input.nextDouble();
       
       //if the person is single filers
       
           
        if( maritedStatus==0 && personalIncome>0 && personalIncome<8350){  // salary range for 10% taxes
           
           double taxes1= (personalIncome * 0.10);   
       System.out.println("You are taxes :  " + taxes1);}
       
       else if( maritedStatus==0 && personalIncome>8351 && personalIncome<33950){ // salary range for 15% taxes
           
           double taxes2= (personalIncome * 0.15); 
       System.out.println("You are taxes :  " + taxes2);}
       
       else if ( maritedStatus==0 && personalIncome>33951 && personalIncome<82250){ // salary range for 25% taxes
           
           double taxes3= (personalIncome * 0.25); 
       System.out.println("You are taxes :  " + taxes3);}
       
       else if ( maritedStatus==0 && personalIncome>82251 && personalIncome<171550){  // salary range for 28% taxes
           
           double taxes4= (personalIncome * 0.28); 
       System.out.println("You are taxes :  " + taxes4);}
       
       else if ( maritedStatus==0 && personalIncome>171551 && personalIncome<372950){  // salary range for 33% taxes
           
           double taxes5= (personalIncome * 0.33); 
       System.out.println("You are taxes :  " + taxes5);}
       
       else if ( maritedStatus==0 && personalIncome>372951){  // salary range for 35% taxes
           
           double taxes6= (personalIncome * 0.35); 
       System.out.println("You are taxes :  " + taxes6);
              
       }
       
              //salary range formarried filing jointly 
       
        
        else if ( maritedStatus==1 && personalIncome>0 && personalIncome<16700){ // salary range for 10% taxes
           
           double taxes7= (personalIncome * 0.10);   
       System.out.println("You are taxes :  " + taxes7);}
       
       else if ( maritedStatus==1 && personalIncome>16701 && personalIncome<67900){ // salary range for 15% taxes
           
           double taxes8= (personalIncome * 0.15);  
       System.out.println("You are taxes :  " + taxes8);}
       
       else if ( maritedStatus==1 && personalIncome>67901 && personalIncome<137050){ // salary range for 25% taxes
           
           double taxes9= (personalIncome * 0.25); 
       System.out.println("You are taxes :  " + taxes9);}
       
       else if ( maritedStatus==1 && personalIncome>137051 && personalIncome<208850){ // salary range for 28% taxes
           
           double taxes10= (personalIncome * 0.28); 
       System.out.println("You are taxes :  " + taxes10);}
       
       else if ( maritedStatus==1 && personalIncome>208851 && personalIncome<372950){  // salary range for 33% taxes
           
           double taxes11= (personalIncome * 0.33); 
       System.out.println("You are taxes :  " + taxes11);}
       
       else if ( maritedStatus==1 && personalIncome>372951){ // salary range for 35% taxes
           
           double taxes12= (personalIncome * 0.35); 
       System.out.println("You are taxes :  " + taxes12);}
       
       // salary range for    married filing separately    
            
        else if (maritedStatus==2 && personalIncome>0 && personalIncome<8350){  // salary range for 10% taxes
           
           double taxes13= (personalIncome * 0.10); 
       System.out.println("You are taxes :  " + taxes13);}
       
       else if ( maritedStatus==2 && personalIncome>8351 && personalIncome<33950){ // salary range for 15% taxes
           
           double taxes14= (personalIncome * 0.15); 
       System.out.println("You are taxes :  " + taxes14);}
       
       else if ( maritedStatus==2 && personalIncome>33951 && personalIncome<68525){  // salary range for 25% taxes
           
           double taxes15= (personalIncome * 0.25); 
       System.out.println("You are taxes :  " + taxes15);}
       
       else if ( maritedStatus==2 && personalIncome>69526 && personalIncome<104425){ // salary range for 28% taxes
           
           double taxes16= (personalIncome * 0.28); 
       System.out.println("You are taxes :  " + taxes16);}
       
       else if ( maritedStatus==2 && personalIncome>104426 && personalIncome<186475){ // salary range for 33% taxes
           
           double taxes17= (personalIncome * 0.33); 
       System.out.println("You are taxes :  " + taxes17);}
       
       else if ( maritedStatus==2 && personalIncome>186476){ // salary range for 35% taxes
           
           double taxes18= (personalIncome * 0.35); 
       System.out.println("You are taxes :  " + taxes18);}
       
       // salary range for head of household
       
       else if( maritedStatus==3 && personalIncome>0 && personalIncome<11950){  // salary range for 10% taxes
           
           double taxes19= (personalIncome * 0.10); 
       System.out.println("You are taxes :  " + taxes19); }
       
       else if ( maritedStatus==3 && personalIncome>11951 && personalIncome<45500){  // salary range for 15% taxes
           
           double taxes20= (personalIncome * 0.15); 
       System.out.println("You are taxes :  " + taxes20);}
       
       else if ( maritedStatus==3 && personalIncome>45501 && personalIncome<117450){  // salary range for 25% taxes
           
           double taxes21= (personalIncome * 0.25); 
       System.out.println("You are taxes :  " + taxes21);}
       
       else if ( maritedStatus==3 && personalIncome>117451 && personalIncome<190200){  // salary range for 28% taxes
           
           double taxes22= (personalIncome * 0.28); 
       System.out.println("You are taxes :  " + taxes22);}
       
       else if ( maritedStatus==3 && personalIncome>190201 && personalIncome<372950){  // salary range for 33% taxes
           
           double taxes23= (personalIncome * 0.33); 
       System.out.println("You are taxes :  " + taxes23);}
       
       else if ( maritedStatus==3 && personalIncome>372951) {  // salary range for 35% taxes
           
           double taxes24= (personalIncome * 0.35); 
       System.out.println("You are taxes :  " + taxes24);}
        
        else
        System.out.println(" Your data presents an ERROR!  "); //error date
       
    
       
      
       
       }
             
    }
    
