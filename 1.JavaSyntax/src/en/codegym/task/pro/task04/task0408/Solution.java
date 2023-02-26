package en.codegym.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Maximum of entered numbers
*/
public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0 && number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}