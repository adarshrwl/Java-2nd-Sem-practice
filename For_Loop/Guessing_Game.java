import java.util.Random;
import java.util.Scanner;

// Question 17
// Write a program that generates a random number and asks the user to guess what
// the number is. If the user's guess is higher than the random number, the program
// should display "Too high, try again." If the user's guess is lower than the random
// number, the program should display "Too low, try again." The program should use
// a loop that repeats until the user correctly guesses the random number.
public class Guessing_Game {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game");
        Random rm = new Random();
        int x = rm.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter your Guess Number");
        while (true) {
            int val = sc.nextInt();
            if (val > x) {
                System.out.println("Enter lower number");
                count++;
            } else if (val < x) {
                System.out.println("Enter bigger number");
                count++;

            } else if (val == x) {
                System.out.println("Congrajulations");
                System.out.println("You have guessed the number in " + count + " times.");
                break;
            }
            if (count > 6) {
                System.out.println("You Loose!!!");
                System.out.println("Your number was " + x);
                break;
            }
        }
    }
}
