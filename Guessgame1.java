//Travonna Wilson
//CST-105
//7/28/17 
//This is my own work 

package guessgame;
/**
 *
 * @author Travonna Wilson
 */
 
 import java.util.Random;
 import java.util.Scanner;
 
public class Guessgame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             System.out.println("Welcome the guessing game.");
        System.out.println("Pick a number between 1 and 10000: ");

        Scanner inputnum = new Scanner(System.in);  
        int maxnum = 10000;
        maxnum = inputnum.nextInt();

        Random rand = new Random();
        int number = rand.nextInt(maxnum);
        int tries = 0; 
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        int lowerVal = 1;
        int upperVal = 10000;
        number = 4000;

            do {  

            System.out.println("Guess a number between" + lowerVal + " and " + upperVal +": ");
            guess = input.nextInt();
            tries++; 

            if (guess == number){
                win = true;
            }

            else if(guess < number){
                lowerVal = guess + 1;
                System.out.println("Number is to low, try again");
                
            }

            else if(guess > number){
                upperVal = guess -1;
                System.out.println("Number is to high, try again");
                
            }

        }
         while (win == false);
         
        System.out.println("You win!");
        
        System.out.println("It took you "+ tries + " tries.");

    }
}
   
    
