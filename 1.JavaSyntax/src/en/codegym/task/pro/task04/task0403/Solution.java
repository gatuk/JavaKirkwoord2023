package en.codegym.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Summation
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here

        Scanner scanner = new Scanner(System.in);
//      System.out.println("Enter a number:");
        String n = scanner.nextLine();
        int sum = 0;
        while (true) {
            if (n.equalsIgnoreCase("ENTER")) {
                break;
            }
            sum += Integer.parseInt(n);
//          System.out.println("Enter a number:");
            n = scanner.nextLine();

        }
        System.out.println(sum);

    }
}


