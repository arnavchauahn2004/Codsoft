import java.util.Random;
import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        Random rndm = new Random();
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int roundsWon = 0;
        boolean Again = true;
        while (Again) {
            int number = rndm.nextInt(100) + 1; // generate a random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 6; // limit the number of attempts to 6
            System.out.println("Welcome to the  game!");
            System.out.println("I'm thinking of a number between 1 and 100.");
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int Guess = sc.nextInt();
                attempts++;
                if (Guess == number) {
                    System.out.println(" Congratulations! You guessed the number in " + attempts + " attempts.");
                    score += maxAttempts - attempts; // increment score based on attempts taken
                    roundsWon++;
                    break;
                } else if (Guess < number) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you didn't guess the number. The correct answer was " + number);
            }
            System.out.print("Do you want to play again? (y/n): ");
            String response = sc.next();
            Again = response.equalsIgnoreCase("y");
        }
        System.out.println("Your final score is " + score + " and you won " + roundsWon + " rounds.");
    }
}