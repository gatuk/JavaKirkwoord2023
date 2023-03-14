package en.codegym.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Is the glass half empty or half full?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        //write your code here
        Scanner scanner = new Scanner(System.in);
        boolean flag = scanner.nextBoolean();
        double response;
        if (flag) {
            response = Math.ceil(glass);
        }
        else {
            response = Math.floor(glass);
        }
        System.out.println((int) response);
    }
}