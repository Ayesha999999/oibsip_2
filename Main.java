import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int maxAttempts = 5; 
        int attempts = 0;
        
        boolean hasGuessed = false;
        
        System.out.println("Welcome to Guess the Number game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess == targetNumber) {
                hasGuessed = true;
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Try higher.");
            } else {
                System.out.println("Try lower.");
            }
        }
        
        if (hasGuessed) {
            System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you couldn't guess the number. The correct number was " + targetNumber + ".");
        }
    }
}