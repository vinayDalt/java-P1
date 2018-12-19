

import java.util.Scanner;
import java.util.Random;
public class Randomguess {
    public static void main(String args[]) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10);
        int numberOfTries = 0;
        Scanner sc = new Scanner(System.in);
        int guess;
        boolean win =false;

        while (win == false) {
            System.out.println("Enter The number between 1 snd 50");
            guess = sc.nextInt();
            numberOfTries++;
            if (guess == numberToGuess) {
                System.out.println("Number guessed is match with original number ");
                break;
            } else if (guess > numberToGuess) {
                System.out.println("Number guessed is more than original number ");
            } else if (guess < numberToGuess) {
                System.out.println("Number guessed is less than original number ");
            }
        }
    }
}



