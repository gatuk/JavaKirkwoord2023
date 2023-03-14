package en.codegym.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Second smallest number entered
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int count= 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num < smallest) {
                smallest = num;
            }
            if ((num > smallest) && (num <= secondSmallest)) {
                secondSmallest = num;
            }
            count++;
        }
        if (count < 2) {
            System.out.println("error, enter at least two integers");
        }
        else {
            System.out.println("second smallest = " + secondSmallest);
        }
        scanner.close();
    }
}