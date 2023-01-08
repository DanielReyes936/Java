
package standardesviation;

import java.util.Scanner;
import java.lang.Math;

public class StandarDesviation {

     public static void main(String[] args) {
         
         // the input stream opens
       Scanner input= new Scanner(System.in);
       double y[]= new double[10];
       System.out.println("Enter a ten number : ");
       // data request and sum of all
       for (int d = 0; d < 10; d++ ){
   
   System.out.println("Enter a value number " + (d + 1) + ":");
       
       y[d]= input.nextDouble();
       }
       System.out.println("The mean is: " + mean(y));//output arithmetic media
       System.out.println("The Standar desviation is: " + deviation(y)); // output standard deviation
    }
       
    
    public static double deviation (double[]x){   //declared method
        double medx = mean(x);
        double sumat = 0.0;
        
        for (int d = 0; d < x.length; d++ ){
            double z = x[d] - medx;
            sumat = sumat + z * z;      //calculating standard deviation
        }
        double standard = Math.sqrt(sumat/(x.length - 1));
        return standard; // return s. deviation
        }
    public static double mean (double[]x){   //declared method
    
    double sumat = 0.0;
    
    for (int d = 0; d < x.length; d++ )
    {
        sumat += x[d];   //calculating mean
    }
       return sumat/x.length;  //return mean
    }
}
     
    
    
   