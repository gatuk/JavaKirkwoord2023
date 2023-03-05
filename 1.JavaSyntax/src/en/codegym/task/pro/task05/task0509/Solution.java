package en.codegym.task.pro.task05.task0509;
/*
Multiplication table
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    //write your code here
    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10]; // 10 rows and 10 columns
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}

