package en.codegym.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Quadrants
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(quadrant(x, y));
    }

    public static String quadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return "1";
        } else if (x < 0 && y > 0) {
            return "2";
        } else if (x < 0 && y < 0) {
            return "3";
        } else if (x > 0 && y < 0) {
            return "4";
        }
        return null;
    }
}
