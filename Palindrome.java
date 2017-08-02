
package palindrome;
//Travonna Wilson
//7/29/17
//CST-105
//this is my own work

 
public class Palindrome {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int max = 100000;

 
        System.out.println("Generate Prime numbers between 1 and " + max);


        for (int i = 1; i<max; i++) {

 

            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {

                    isPrimeNumber = false;

                    break; 

                }

            }

             

            // print the number if prime

            if (isPrimeNumber) {
                System.out.print(i + " ");

            }
        }

    }

}
  
    
        
    
       
        
       
    
   
