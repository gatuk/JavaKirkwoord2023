package en.codegym.task.pro.task05.task0515;

import java.util.Arrays;
/*
Comparing two-dimensional arrays
*/

public class Solution {

    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        // System.out.println(arrayFirst == arraySecond);// false-compare address
        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond)); // true-compare content

    }
}
