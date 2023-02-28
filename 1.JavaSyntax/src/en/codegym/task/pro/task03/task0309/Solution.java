package en.codegym.task.pro.task03.task0309;

import java.util.Scanner;

/* 
Looking for the maximum
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1= scanner.nextInt();
        int num2 = scanner.nextInt();
        // Largest among n1 and n2

        int maximum = (num1 > num2) ? num1 : num2;
        System.out.println(maximum);
    }
}
