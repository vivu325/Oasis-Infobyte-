import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 5;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound);

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (userGuess < generatedNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + generatedNumber);
            }
        }

        scanner.close();
    }
}
