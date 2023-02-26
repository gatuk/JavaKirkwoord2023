package en.codegym.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Second smallest number entered
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;

            }
            if (number < secondSmallest && number > smallest) {
                secondSmallest = number;
            }

        }
        System.out.println(secondSmallest);

    }
}