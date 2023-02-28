package en.codegym.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Triangle
*/
public class Solution {
    private static final String TRIANGLE_EXISTS = "It's a triangle";
    private static final String TRIANGLE_DOES_NOT_EXIST = "It's not a triangle";

    public static void main(String[] args) {
        //write your code here
        Scanner input = new Scanner(System.in);
        int sideA = input.nextInt();
        int sideB = input.nextInt();
        int sideC = input.nextInt();
        sideA=3;
        sideB=4;
        sideC=5;
        // sideA, SideB and SideC are pass as arguments to isTriangle which has parameters sideA, sideB and sideC.
        // It returns true if the triangle exists, false if it doesn't.
        if (isTriangle(sideA, sideB, sideC)) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_DOES_NOT_EXIST);
        }
    }

    public static boolean isTriangle(int sideA, int sideB, int sideC) {
        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }
}
