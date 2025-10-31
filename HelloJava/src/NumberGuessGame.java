import java.util.Scanner;
import java.util.Random;
public class NumberGuessGame {
    public static void mian(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        System.out.println("============================================");
        System.out.println("WELCOME TO NUMBER GUESS GAME — LOGIC LAB 3.0");
        System.out.println("============================================\n");

        int secretNumber = ra.nextInt(100) + 1;
        int attempts = 0;
        int guess;

        System.out.println("I've picked a number between 1 and 100.");
        System.out.println("Can you guess it? Let's find out!\n");

        while (true) {
            System.out.println("Enter Your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Correct! You nailed it in " + attempts + " attempts");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower  number");
            }

            if (attempts == 10) {
                System.out.println("\n You've hit 10 attempts.  The correct number was: " + secretNumber);
                break;
            }
        }

        System.out.println("\n===============================================");
        System.out.println("✨ Game Over — Keep practicing, champ! 💪");
        System.out.println("===============================================");

        sc.close();
    }
}
