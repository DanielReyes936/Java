
package arraysreverse;


public class ArraysReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
     int random = (int)(Math.random() * 11);

    int cube = 0;

    int[] numbers = new int[10];

    for(int i = 0; i < numbers.length; i++) {
    numbers[i] = random;
        System.out.println("The numbers are: " + numbers[i]);
    }

            
        }
       
    }
    
}
