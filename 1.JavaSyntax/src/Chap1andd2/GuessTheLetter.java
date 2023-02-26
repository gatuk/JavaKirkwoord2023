package Chap1andd2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guess, answer;
        Random rand = new Random();
        int min = 65;
        int max = 90;
        int randNum = rand.nextInt(max + 1 - min) + min;
        answer = (char) randNum + "";
        System.out.println(answer);
        while(true) {
            guess = scanner.nextLine();
            if (guess.equalsIgnoreCase(answer)) {
                System.out.println("You guessed correctly");
                break;

            } else {
                System.out.println("Incorrectly, the answer was: " + answer);
            }
        }
    }
}
