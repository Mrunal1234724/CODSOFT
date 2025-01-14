import java.util.Random;
import java.util.Scanner;

public class numbergameee3 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Random rand = new Random();

     int rounds = 0;
     int totalScore = 0;
     boolean PlayAgain = true;

     while (PlayAgain) {
        rounds++;
        int NumberToGuess = rand.nextInt(100) + 1;
        int Attempts = 0;
        int MaxAttempts = 10; // Maximum number of attempts allowed
        boolean GuessedCorrectly = false;

        System.out.println("Guess the number between 1 and 100.You have " + MaxAttempts + " attempts.");
       
        while (Attempts < MaxAttempts && !GuessedCorrectly) {

            System.out.println("Enter your guess:");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer value");
                scanner.next();
                System.out.println("Enter you guess:");

            }
            int UserGuess = scanner.nextInt();
            Attempts++;

             // check if the guess is correct
            if (UserGuess ==  NumberToGuess) {
                System.out.println("Congratulations! You've guessed the correct number in " + Attempts + " attempts.");
                totalScore += MaxAttempts - Attempts + 1; // Score increases with fewer attempts
                GuessedCorrectly = true;
                  // check if the guess is too low
            } else if (UserGuess <  NumberToGuess) {
                System.out.println("Too low. Try again.");
                  // check if the guess is too high
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        if (!GuessedCorrectly) {
            System.out.println("Sorry, you've used all your attempts. The correct number was " +  NumberToGuess + ".");
        }

        System.out.println("Your current score: " + totalScore);
        System.out.print("Do you want to play another round? (yes/no): ");
        String UserResponse = scanner.next();

       if (UserResponse.equalsIgnoreCase("no")); {
        PlayAgain = false;
       }

    System.out.println("Thank you for playing! Your final score: " + totalScore + " after " + rounds + " rounds.");
     //close the scanner object
    scanner.close();
}
}
}
