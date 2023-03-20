package en.codegym.task.pro.task05.task0511;

import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            multiArray[i] = new int[m];
        }
    }
}



