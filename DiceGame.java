// import 
import java.util.Random;
import java.util.*;

/**
 * Class Dice Game.
* This program generates number up to 10
* and it randomly generates each time.
* @author  John Junior Omage
* @version 1.0
* @since   2020-09-24
*/

public class DiceGame{
  
  public static void main(String[] args) {
    
    // Allow the user to put an input and create random
    Scanner userInput = new Scanner(System.in);
    Random randomNum = new Random();
    
    // declare variables
    int guessNumber;
    int limitNumber = 6;
    int counter = 0;
    
    // generate random numbers between 1 - 6
    int random = randomNum.nextInt(limitNumber);
    
    // Ask user for a number
    System.out.println("Guess a number from 1 - 6.");
    
    while (true) {
      
      // Set user's guess to guessNumber
      guessNumber = userInput.nextInt();
      
      // Check guessed number
      if (guessNumber != random) {
        
        // increment counter
        counter++;
        
        // Tell them to keep trying
        System.out.println("You got it wrong, try again.");
        
      } else {
        break;
      }
    }
    
    // increment counter
    counter++;
    
    // display that user got correct answer
    System.out.println("You got the right answer! The answer is: " + random);
    
    // display the amount of guesses
    System.out.println("Number of guesses: " + counter);
  } 
}