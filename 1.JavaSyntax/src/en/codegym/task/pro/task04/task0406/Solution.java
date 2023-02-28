package en.codegym.task.pro.task04.task0406;

import java.util.Scanner;

/* 
We show what we get
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here

        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        while (true) {
            if (n.equalsIgnoreCase("enough")) {
                break;
            }
            System.out.println(n);
            n = scanner.nextLine();

        }
        scanner.close();

    }
}