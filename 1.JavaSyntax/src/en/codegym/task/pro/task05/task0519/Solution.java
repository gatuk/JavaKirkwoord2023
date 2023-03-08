package en.codegym.task.pro.task05.task0519;

import java.util.Arrays;

/*
Is anyone there?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //write your code here
        int[] copyOf = Arrays.copyOf(array, array.length);
        Arrays.sort(copyOf);
        if (Arrays.binarySearch(copyOf, element) >= 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
