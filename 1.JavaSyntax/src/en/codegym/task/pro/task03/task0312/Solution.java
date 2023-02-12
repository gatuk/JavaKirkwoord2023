package en.codegym.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Let's compare strings
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        if (s1.equals(s2)) {
            System.out.println("The strings are the same");
        } else {
            System.out.println("The strings are different");
        }
    }
}
