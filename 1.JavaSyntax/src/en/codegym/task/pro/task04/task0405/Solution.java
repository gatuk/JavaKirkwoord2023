package en.codegym.task.pro.task04.task0405;

/* 
Unfilled rectangle
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        int outer = 1;
        while (outer <= 10) {
            int inner = 1;
            while (inner <= 20) {
                if (outer == 1 || outer == 10 || inner == 1 || inner == 20) {
                    System.out.print("B");
                } else {
                    System.out.print(" ");
                }
                inner++;
            }
            outer++;
            System.out.println();
        }

    }
}