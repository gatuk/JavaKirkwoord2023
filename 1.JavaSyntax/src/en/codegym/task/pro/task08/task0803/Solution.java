package en.codegym.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Smallest element of an array
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //write your code here
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            min=Math.min(min, ints[i]);
            }
        return min;
        }

    public static int[] getArrayOfTenElements() {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[10];
        for (int i = 0; i < 10; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }
}
