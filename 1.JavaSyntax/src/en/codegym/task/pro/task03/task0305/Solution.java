package en.codegym.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Three numbers
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a == b) && (a == c)) {
            System.out.println(a + " " + b + " " + c);
        } else if ((a == b) && (a != c)) {
            System.out.println(a + " " + b);
        } else if ((a == c) && (a != b)) {
            System.out.println(a + " " + c);
        } else if ((b == c) && (b != a)) {
            System.out.println(b + " " + c);
        } else {
            return;
        }
    }
}
