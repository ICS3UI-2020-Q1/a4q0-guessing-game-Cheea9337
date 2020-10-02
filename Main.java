import java.util.Scanner;
import java.util.Random;
/**
 * Number Guessing Game
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user imput
    Scanner input = new Scanner(System.in);
    // creating the random generator
    Random rand = new Random();

    // create a random Number
    int randNum = rand.nextInt(100) + 1;

    // declare the guess variable
    int guess;
    // game loop
    do{
      // ask the user for their guess
      System.out.println("Please guess a number between 1 and 100");
      guess = input.nextInt();
      // is it too high or too low?
      if(guess > randNum){
        System.out.println("Too High");
      }else if(guess < randNum){
        System.out.println("Too Low");
      }

    }while(guess != randNum);
    // outside the loop means we won
    System.out.println("Congratulations, You Won!");
    
  }
}
