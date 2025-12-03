import java.util.Random; // generates the secret random number.
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0; // adds points for each round.
        boolean playAgain = true; //controls whether the game continues

        while (playAgain) {
            int number = rand.nextInt(100) + 1; // random number between 1–100
            int attempts = 0;
            int maxAttempts = 7; // max attemts per round
        
            System.out.println("I have generated a number between 1 and 100.");
            System.out.println("Try to guess it! You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");// prompt user for input 
                int guess = sc.nextInt();
                attempts++;

                // check the game (using if else if statements)

                if (guess == number) {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    totalScore += (maxAttempts - attempts + 1); // better score for fewer attempts
                    break;

                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Out of attempts! The correct number was: " + number);
            }

            System.out.print("Play again? (yes/no): ");
            String option = sc.next().toLowerCase();
            playAgain = option.equals("yes"); // continue if user types "yes"
        }

        System.out.println("Your total score: " + totalScore);
        System.out.println("Thanks for playing!");
        sc.close(); // close the scanner
    }
}
