package en.codegym.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Broken keyboard
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (password.equalsIgnoreCase(secret)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}
