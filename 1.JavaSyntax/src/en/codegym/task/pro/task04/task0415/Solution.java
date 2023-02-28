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
        int area = (int) (PI * radius * radius);
        System.out.println(area);
    }
}