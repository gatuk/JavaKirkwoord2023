package en.codegym.task.pro.task04.task0415;

import java.util.Scanner;
/* 
Area of a circle
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double PI = 3.14;
        if (radius > 0) {
            int area = (int) (PI * Math.pow(radius, 2));
            System.out.println(area);
        }

    }
}