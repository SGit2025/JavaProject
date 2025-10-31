import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        String playAgain;

        System.out.println("============================================");
        System.out.println("🎯 WELCOME TO NUMBER GUESS GAME — LOGIC LAB 3.0");
        System.out.println("============================================\n");

        do {
            int secretNumber = ra.nextInt(100) + 1;
            int attempts = 0;
            int guess;

            System.out.println("🤖 I've picked a number between 1 and 100.");
            System.out.println("Can you guess it? Let's find out!\n");

            while (true) {
                System.out.print("👉 Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("🎉 Correct! You nailed it in " + attempts + " attempts!");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("📉 Too low! Try a higher number.");
                } else {
                    System.out.println("📈 Too high! Try a lower number.");
                }

                if (attempts == 10) {
                    System.out.println("\n😢 You've hit 10 attempts. The correct number was: " + secretNumber);
                    break;
                }
            }

            System.out.print("\n🔁 Do you want to play again? (Y/N): ");
            playAgain = sc.next().toUpperCase();
            System.out.println("\n--------------------------------------------");

        } while (playAgain.equals("Y"));

        System.out.println("\n===============================================");
        System.out.println("✨ Game Over — Thanks for playing, legend! 💪");
        System.out.println("===============================================");

        sc.close();
    }
}
