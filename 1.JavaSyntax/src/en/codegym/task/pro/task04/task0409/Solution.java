package en.codegym.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Minimum of entered numbers
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int minNum = scanner.nextInt();

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < minNum) {
                minNum = number;
            }
        }
        System.out.println(minNum);


    }
}